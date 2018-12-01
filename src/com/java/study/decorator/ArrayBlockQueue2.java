package com.java.study.decorator;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 2:43 PM 2018/11/29
 */
public class ArrayBlockQueue2 {
	/**
	 * 定义装苹果的篮子
	 */
	public static class Basket{
		/**
		 * 篮子，能够容纳三个苹果
		 */
		BlockingQueue<String> basket=new ArrayBlockingQueue<>(4);

		public void produce() throws InterruptedException {
			basket.put("an apple");
		}

		public String consume() throws InterruptedException {
			String apple=basket.take();
			return apple;
		}

		public int getAppleNum(){
			return basket.size();
		}
	}

	public static void testBasket() {
		final Basket basket=new Basket();
		class Producer implements Runnable{

			@Override
			public void run() {
				while (true){

					try {
						basket.produce();
						System.out.println("生产完之后的苹果："+basket.getAppleNum());
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		class Consumer implements Runnable{

			@Override
			public void run() {
				{
					while (true) {
						try {
							String apple = basket.consume();
							System.out.println(apple);
							System.out.println("消费完之后的苹果：" + basket.getAppleNum());
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		ExecutorService executorService= Executors.newCachedThreadPool();
		Producer producer=new Producer();
		executorService.submit(producer);
		Consumer consumer=new Consumer();
		executorService.submit(consumer);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}

	public static void main(String[] args) {
		ArrayBlockQueue2.testBasket();
	}


}
