package org.softnovo.seckill.test.newthread;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ThreadTrain2 implements Runnable {
	private static int count = 0;
	private final Object obj1 = new Object();
	private final Object obj2 = new Object();

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			count = count + 1;
		}
	}
	
	private void t1() {
		synchronized (obj1) {
			System.out.println("---- t1");
		}
	}
	
	private void t2() {
		synchronized (obj2) {
			System.out.println("---- t1");
		}
	}

	class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) throws Exception {
		
	}

	public static class Worker implements Runnable {
		private volatile boolean flag = true;
		
		protected void stopTask() {
		    this.flag = false;
		}

		@Override
		public void run() {
			int i = 0;
			while (flag) {
				// Thread.sleep(100); // 休眠100ms
				i++;
				System.out.println(
						Thread.currentThread().getName() + " (" + Thread.currentThread().getState() + ") loop " + i);
				System.out.println(Thread.currentThread().isInterrupted());
			}
		}
	}

	static class MyUnchecckedExceptionhandler implements UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println(t.getName() + " (" + t.getState() + ") catch InterruptedException.");
			System.out.println(t.isInterrupted());
			System.out.println(t.getName() + " (" + t.getState() + ") catch InterruptedException.");
			System.out.println("捕获异常处理方法：" + e);
		}
	}

	// public static void main(String[] args) throws InterruptedException {
	// ThreadTrain2 threadTrain2 = new ThreadTrain2();
	//
	//
	// ListNode listNode1 = threadTrain2.new ListNode(3);
	// ListNode listNode2 = threadTrain2.new ListNode(4);
	// listNode2.next = listNode1;
	// ListNode listNode3 = threadTrain2.new ListNode(2);
	// listNode3.next = listNode2;
	//
	// // ----
	// ListNode listNode11 = threadTrain2.new ListNode(8);
	// ListNode listNode22 = threadTrain2.new ListNode(0);
	// listNode22.next = listNode11;
	// ListNode listNode33 = threadTrain2.new ListNode(7);
	// listNode33.next = listNode22;
	//
	//
	// }

	// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	// while (l1.next != null) {
	// }
	// }

	/**
	 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static Integer[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> tempMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			tempMap.put(nums[i], i);
		}

		for (int j = 0; j < nums.length; j++) {
			if (tempMap.get(target - nums[j]) != null && tempMap.get(target - nums[j]) != j) {
				Integer[] x = new Integer[] { j, tempMap.get(target - nums[j]) };

				return x;
			}
		}

		throw new RuntimeException("no that numbers");
	}

}
