package org.softnovo.seckill.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.softnovo.seckill.dao.SeckillDao;
import org.softnovo.seckill.dao.SuccessKilledDao;
import org.softnovo.seckill.dto.Exposer;
import org.softnovo.seckill.dto.SeckillExecution;
import org.softnovo.seckill.entity.Seckill;
import org.softnovo.seckill.entity.SuccessKilled;
import org.softnovo.seckill.enums.SeckillStateEnum;
import org.softnovo.seckill.exception.RepeatKillException;
import org.softnovo.seckill.exception.SeckillCloseException;
import org.softnovo.seckill.exception.SeckillException;
import org.softnovo.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

@Service
public class SeckillServiceImpl implements SeckillService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SeckillService.class);
	
	@Autowired
	private SeckillDao seckillDao;
	@Autowired
	private SuccessKilledDao successKilledDao;
	
	private static final String salt = "2425345ljlsjfsjdf$^$&$^#%#$%#$^$%DGFDH";

	@Override
	public List<Seckill> getSeckillList() {
		System.out.println("getSeckillList");
		return null;
		//return seckillDao.queryAll(0, 4);
	}

	@Override
	public Seckill getById(long seckillId) {
		//return seckillDao.queryById(seckillId);
		return null;
	}

	@Override
	public Exposer exportSeckillUrl(long seckillId) {
		Seckill seckill = getById(seckillId);
		if (seckill == null) { // 没有这个秒杀
			return new Exposer(false, seckillId);
		}
		
		// 
		Date startTime = seckill.getStartTime();
		Date endTime = seckill.getEndTime();
		Date nowTime = new Date();
		if (nowTime.getTime() < startTime.getTime() || nowTime.getTime() > endTime.getTime()) {
			return new Exposer(false, seckillId, nowTime.getTime(), startTime.getTime(), endTime.getTime());
		}
		
		// 转换特定字符串的过程，
		String md5 = getMD5(seckillId);
		return new Exposer(true, md5, seckillId);
	}
	
	private String getMD5(long seckillId) {
		String base = seckillId + "/" + salt;
		String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
		return md5;
	}

	@Override
	@Transactional
	/**
	 * 使用注解控制事务方法的优点：
	 * 1. 开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2. 保证事务方法的执行时间尽可能短,不要穿插其他网络操作（RPC/HTTP请求或者剥离到事务方法外部）
	 * 3. 不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制.
	 * 
	 */
	public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException {
		if (md5 == null || !md5.equals(getMD5(seckillId))) {
			throw new SeckillException("seckill data rewrite");
		}
		
		try {
			// 执行秒杀逻辑：减库存 + 记录购买行为.
			Date nowTime = new Date();
			int updateCount = seckillDao.reduceNumber(seckillId, nowTime);
			if (updateCount <= 0) {
				// 没有更新到记录
				throw new SeckillCloseException("seckill is closed");
			} else {
				// 记录购买行为
				int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
				if (insertCount <= 0) {
					throw new RepeatKillException("seckill repeated");
				} else {
					SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
					return new SeckillExecution(seckillId, SeckillStateEnum.SUCCESS, successKilled);
				}
			}
		} catch (SeckillCloseException sce) {
			throw sce;
		} catch (RepeatKillException rke) {
			throw rke;
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new SeckillException("seckill inner error " + e.getMessage());
		}
	}
}
