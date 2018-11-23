package org.softnovo.seckill.test.newthread.volatiler;

public class TestVolatile {

	private static int INIT_VALUE = 0;
	private static int MAX_LIMIT = 5;

	public static void main(String[] args) {
		
		
		

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				int localValue = INIT_VALUE;
//				while (localValue < MAX_LIMIT) {
//					if (localValue != INIT_VALUE) {
//						System.out.printf("the value updated to [%d]\n", INIT_VALUE);
//						localValue = INIT_VALUE;
//					}
//				}
//			}
//		}, "reader").start();
//		
//		
//		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				int localValue = INIT_VALUE;
//				while (INIT_VALUE < MAX_LIMIT) {
//					System.out.printf("update the value to [%d]\n", ++localValue);
//					INIT_VALUE = localValue;
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}, "updater").start();
	}
}
