package org.softnovo.seckill.utils;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

public class SystemJUnit4ClassRunner extends SpringJUnit4ClassRunner {
	
	static {
		try {
			Log4jConfigurer.initLogging("classpath:log4j.properties");
		} catch (Exception e) {
			System.err.println("Cannot Initialize log4j");
		}
	}

	public SystemJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}
	
	

}
