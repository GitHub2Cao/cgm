package org.softnovo.seckill.utils;

import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class Tests {
	static {
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		JoranConfigurator configurator = new JoranConfigurator();
		configurator.setContext(lc);
		lc.reset();
		try {
			configurator.doConfigure("/Users/cgm/eclipse-workspace/cgm/src/main/resources/config/logback.xml");//加载logback配置文件
		} catch (Exception e) {
			e.printStackTrace();
			PropertyConfigurator.configure("/Users/cgm/eclipse-workspace/cgm/src/main/resources/config/log4j.properties");//加载logj配置文件
		}
	}
}
