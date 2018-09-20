package org.softnovo.seckill.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadException implements Runnable {
	@Override
	public void run() {
		throw new RuntimeException("你逮不到我！！！");
	}

	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ThreadException());
		} catch (RuntimeException e) {
			System.out.println("———————————————11111—————————————" + e);
		} finally {
			System.out.println("++++++++++++++++++++++++++++");
		}
	}
}
