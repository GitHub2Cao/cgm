package org.softnovo.seckill.test.newthread.volatiler;

public class Singleton {
	private static Singleton singleton;
	private Integer age;
	private String name;
	private static int count = 0;
	//private static boolean inited = false;

	private Singleton() {
		this.age = 10;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.name = "xxxxx";
		count++;
		//inited = true;
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("singleton is null");
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public String toJson() {
		return "age : " + age + ", name : " + name + ", count : " + count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance().toJson());
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance().toJson());
			}
		}).start();
	}
}
