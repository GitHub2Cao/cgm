package org.softnovo.seckill.aop.service;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.softnovo.seckill.service.SeckillServiceTest;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class ServiceAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAspect.class);
	// 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
	@Pointcut("execution(* org.softnovo.seckill.service..*(..))")
	public void aspect() {
	}
	
	// 配置前置通知,使用在方法aspect()上注册的切入点
	@Before("aspect()")
	public void before(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		LOGGER.info(Arrays.deepToString(args));
		LOGGER.info("执行before.....");
	}
	
	// 配置后置通知,使用在方法aspect()上注册的切入点
	@After("aspect()")
	public void after(JoinPoint joinPoint) {
		LOGGER.info("执行after.....");
	}
	
	// 配置环绕通知,使用在方法aspect()上注册的切入点
	@Around("aspect()")
	public void around(JoinPoint joinPoint) {
		long start = System.currentTimeMillis();
		try {
			((ProceedingJoinPoint) joinPoint).proceed();
			long end = System.currentTimeMillis();
			LOGGER.info("Success: end - start = {}", (end - start));
			
		} catch (Throwable e) {
			long end = System.currentTimeMillis();
			LOGGER.info("fail: end - start = {}", (end - start));
			// if(log.isInfoEnabled()){
			// log.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms with
			// exception : " + e.getMessage());
			// }
		}
	}
	
	// 配置后置返回通知,使用在方法aspect()上注册的切入点
	@AfterReturning("aspect()")
	public void afterReturn(JoinPoint joinPoint) {
		// if(log.isInfoEnabled()){
		// log.info("afterReturn " + joinPoint);
		// }
		LOGGER.info("return ====== ");
	}
	
	//配置抛出异常后通知,使用在方法aspect()上注册的切入点
	@AfterThrowing(pointcut = "aspect()", throwing = "ex")
	public void afterThrow(JoinPoint joinPoint, Exception ex) {
		System.out.println("Exception");
		// if(log.isInfoEnabled()){
		// log.info("afterThrow " + joinPoint + "\t" + ex.getMessage());
		// }
	}

}
