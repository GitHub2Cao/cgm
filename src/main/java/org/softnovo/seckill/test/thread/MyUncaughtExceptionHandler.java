package org.softnovo.seckill.test.thread;

import java.lang.Thread.UncaughtExceptionHandler;

class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("------------- caught 跑不掉 ----------------" + e);
	}
}
