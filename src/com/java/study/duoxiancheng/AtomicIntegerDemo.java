package com.java.study.duoxiancheng;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 16:03 2018/9/18
 */
public class AtomicIntegerDemo {
	static AtomicInteger atomicInteger = new AtomicInteger();

	static class IncrementRunnable implements Runnable {
		@Override
		public void run() {
			// 对atomicInteger包装的整数值加10000次
			for (int i = 0; i < 10000; i++) {
				atomicInteger.incrementAndGet();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// 创建10个线程去修改atomicInteger封装的整数值
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new IncrementRunnable());
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		for (int i = 0; i < 10; i++) {
			threads[i].join();
		}
		System.out.println(atomicInteger);
	}
}
