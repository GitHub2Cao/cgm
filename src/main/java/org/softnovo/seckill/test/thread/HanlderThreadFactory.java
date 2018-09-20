package org.softnovo.seckill.test.thread;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

import org.slf4j.Logger;

public class HanlderThreadFactory implements ThreadFactory {
	
	public Logger LOG;
	
	public HanlderThreadFactory(Logger log) {
		this.LOG = log;
	}

	@Override
	public Thread newThread(Runnable r) {
		System.out.println("创建线程");
		Thread t = new Thread(r);
		t.setName("设置线程名称" + new Date().getTime());
		
		// 一次处理器.
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		
		return t;
	}

}
