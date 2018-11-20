package com.java.study.decorator;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author:HuoYaJing
 * @Description:有界阻塞队列
 * @Date: Create in 10:45 2018/9/9
 */
public class ArrayBlockQueue {

	private final static ArrayBlockingQueue<Apple> queue = new ArrayBlockingQueue<>(2);

	public static void main(String[] args) {
		new Thread(new ProducerArray(queue)).start();
		new Thread(new ConsumerArray(queue)).start();
	}
}

class Apple {
	public Apple() {
	}
}

class ProducerArray implements Runnable {
	private final ArrayBlockingQueue<Apple> mAbq;

	ProducerArray(ArrayBlockingQueue<Apple> arrayBlockingQueue) {
		this.mAbq = arrayBlockingQueue;
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
			System.out.println("生产:" + apple);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class ConsumerArray implements Runnable {

	private ArrayBlockingQueue<Apple> mAbq;

	ConsumerArray(ArrayBlockingQueue<Apple> arrayBlockingQueue) {
		this.mAbq = arrayBlockingQueue;
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
		System.out.println("消费Apple=" + apple);
	}
}
