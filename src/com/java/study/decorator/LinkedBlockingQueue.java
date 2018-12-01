package com.java.study.decorator;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @Author:HuoYaJing
 * @Description:LinkedBlockingQueue
 * @Date: Create in 14:59 2018/9/9
 */
public class LinkedBlockingQueue {
	private final static LinkedBlockingDeque<Apple> queue = new LinkedBlockingDeque<>(2);

	public static void main(String[] args) {
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}
}

class Producer implements Runnable {
	private final LinkedBlockingDeque<Apple> mAbq;

	Producer(LinkedBlockingDeque<Apple> linkedBlockingDeque) {
		this.mAbq = linkedBlockingDeque;
	}

	@Override
	public void run() {
		while (true) {
			Produce();
		}
	}

	private void Produce() {

		try {
			Apple apple = new Apple();
			mAbq.put(apple);
			System.out.println("生产:" + apple.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class Consumer implements Runnable {

	private LinkedBlockingDeque<Apple> mAbq;

	Consumer(LinkedBlockingDeque<Apple> linkedBlockingDeque) {
		this.mAbq = linkedBlockingDeque;
	}

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consumer() throws InterruptedException {
		Apple apple = mAbq.take();
		System.out.println("消费Apple=" + apple.toString());
	}
}


