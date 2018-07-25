package org.softnovo.seckill.dao.cache;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.softnovo.seckill.dao.SeckillDao;
import org.softnovo.seckill.dao.base.BaseTest;
import org.softnovo.seckill.entity.Seckill;

public class RedisDaoTest extends BaseTest {
	@Resource
	private RedisDao redisDao;
	
	@Resource
	private SeckillDao seckillDao;
	
	
	@Test
	public void testQueryById() throws Exception {
		try {
			Seckill seckill = new Seckill();
//			seckill.setSeckillId(1000);
//			
//			
//			private long seckillId;
//			private String name;
//			private int number;
//			private Date startTime;
//			private Date endTime;
//			private Date createTime;
			//redisDao.getSeckill(seckillId)
			
			String result = redisDao.putSeckill(seckill);
			System.out.println("_+_+_+_+_+_+_+_+_+" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetSekill() throws Exception {
		long seckillId = 1000;
		Seckill seckill = redisDao.getSeckill(seckillId);
		if (seckill == null) {
			Seckill obj = seckillDao.queryById(seckillId);
			redisDao.putSeckill(obj);
		} else {
			System.out.println("_+_+_+_+_+ " + seckill);
		}
		
		System.out.println("*************** " + redisDao.getSeckill(seckillId));
	}
}
