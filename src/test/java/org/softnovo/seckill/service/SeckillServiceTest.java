package org.softnovo.seckill.service;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.softnovo.seckill.dto.Exposer;
import org.softnovo.seckill.dto.SeckillExecution;
import org.softnovo.seckill.entity.Seckill;
import org.softnovo.seckill.exception.RepeatKillException;
import org.softnovo.seckill.exception.SeckillCloseException;
import org.softnovo.seckill.exception.SeckillException;
import org.softnovo.seckill.utils.Tests;
import org.springframework.beans.factory.annotation.Autowired;


public class SeckillServiceTest extends Tests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SeckillServiceTest.class);

	@Autowired
	private SeckillService seckillService;

	@Test
	public void testGetSeckillList() throws Exception {
		List<Seckill> list = seckillService.getSeckillList();
		LOGGER.info("list = {}", list);
	}

	@Test
	public void testGetById() throws Exception {
		long id = 1000L;
		Seckill seckill = seckillService.getById(id);
		//LOGGER.info("seckill = {}", seckill);
		LOGGER.trace("======trace");  
		LOGGER.debug("======debug");  
		LOGGER.info("======info");  
		LOGGER.warn("======warn");  
		LOGGER.error("======error");  
	}

	@Test
	public void testExportSeckillUrl() throws Exception {
		long id = 1000L;
		Exposer exposer = seckillService.exportSeckillUrl(id);
		LOGGER.info("exposer = {}", exposer);
		/**
		 * exposer = Exposer [exposed=true, md5=aeb48ca7a59f1e08e115b6452e225eb3, seckillId=1000, now=0, start=0, end=0]
		 */
	}

	@Test
	public void testExecuteSeckill() throws Exception {
		long id = 1000;
		long phone = 15925676777L;
		String md5 = "aeb48ca7a59f1e08e115b6452e225eb3";
		try {
			SeckillExecution seckillExecution = seckillService.executeSeckill(id, phone, md5);
			LOGGER.info("seckillExecution = {}", seckillExecution);
		} catch (RepeatKillException e1) {
			LOGGER.error("", e1);
		} catch (SeckillCloseException e2) {
			LOGGER.error("", e2);
		} catch (SeckillException e3) {
			LOGGER.error("", e3);
		}
	}
}
