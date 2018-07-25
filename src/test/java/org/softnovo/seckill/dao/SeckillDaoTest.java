package org.softnovo.seckill.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.softnovo.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring 和junit 整合，junit启动时加载springIoC容器，spring-test，junit
 * @author cgm
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SeckillDaoTest {
	@Resource
	private SeckillDao seckillDao;

	@Test
	public void testQueryById() throws Exception {
		try {
			long id = 1000;
			Seckill seckill = seckillDao.queryById(id);
			System.out.println(seckill.getName());
			System.out.println(seckill);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQueryAll() throws Exception {
		int offset = 0;
		int limit = 100;
		List<Seckill> list = seckillDao.queryAll(offset, limit);
		System.out.println("_+_+_+_+_+_+_+_ " + list);
	}
	
	@Test
	public void testReduceNumber() throws Exception {
		long seckillId = 1000;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2015-11-01 01:02:00";
		Date killTime = sdf.parse(dateStr);
		
		seckillDao.reduceNumber(seckillId, killTime);
	}

}
