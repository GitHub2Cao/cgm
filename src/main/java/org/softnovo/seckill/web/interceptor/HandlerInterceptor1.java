package org.softnovo.seckill.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HandlerInterceptor1 extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(HandlerInterceptor1.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		LOGGER.info("===========HandlerInterceptor1 preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		LOGGER.info("===========HandlerInterceptor1 postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		LOGGER.info("===========HandlerInterceptor1 afterCompletion");
	}
}
