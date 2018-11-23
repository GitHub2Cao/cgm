package org.softnovo.seckill.test.newthread;

public class StopThread implements Runnable {
	private boolean isInterrupted = false;

	@Override
	public synchronized void run() {
		while (!isInterrupted || !Thread.currentThread().isInterrupted()) {
			try {
				System.out.println("thread");
				wait();
			} catch (Exception e) {
				stopThread();
			}
			System.out.println("thread run..");
		}
	}

	public void stopThread() {
		isInterrupted = true;
	}

	public static void main(String[] args) {
		StopThread stopThread1 = new StopThread();
		//Thread thread1 = new Thread(stopThread1);
		Thread thread2 = new Thread(stopThread1);
		//thread1.start();
		thread2.start();
		int i = 0;
		while (true) {
			if (i == 10) {
				System.out.println("thread main..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if (i == 300) {
				// stopThread1.stopThread();
				//thread1.interrupt();
				thread2.interrupt();
				break;
			}
			i++;
		}
		System.out.println("end");
	}
}
