package com.java.study.duoxiancheng;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 11:25 AM 2018/11/29
 */
public class demo1 {
	private static final int __processorSize =50;

	private static final ExecutorService testExector = new ThreadPoolExecutor(
			__processorSize
			,__processorSize
			,1000 * 60
			, TimeUnit.MILLISECONDS
			,new LinkedBlockingDeque<Runnable>(10000)
			,new ThreadFactoryImpl("ImportThread_"));

	@PostConstruct
	public void start(){
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				if(testExector!=null && !testExector.isShutdown()){
					testExector.shutdownNow();
				}
			}
		}));
	}

	public static void main(String[] args) {
		int[] array=new int[1000];
		for (int i=0;i<array.length;i++){
			array[i]= (int) (Math.random()*1000);
		}
		for (int i=0;i<array.length;i++){
			System.out.println("iiiii+"+i);
			CountDownLatch countDownLatch = new CountDownLatch(array.length);
			testExector.submit(()->getResult());
		}
	}

	public static void getResult(){
		System.out.println("num one");
		testExector.submit(()->getRResult());
	}

	public static void getRResult(){
		System.out.println("the end");
	}
}
