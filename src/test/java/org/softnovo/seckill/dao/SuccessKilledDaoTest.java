package org.softnovo.seckill.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.softnovo.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SuccessKilledDaoTest {
	
	@Resource
	private SuccessKilledDao successKilledDao;

	@Test
	public void testInsertSuccessKilled() throws Exception {
		long seckillId = 1;
		long userPhone = 15925676776L;
		
		successKilledDao.insertSuccessKilled(seckillId, userPhone);
	}

	@Test
	public void testQueryByIdWithSeckill() {
		long seckillId = 1000;
		long userPhone = 15925676776L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
		System.out.println(successKilled);
		
	}
}
