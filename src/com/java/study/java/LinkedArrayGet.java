package com.java.study.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @Author:HuoYaJing
 * @Description:LinkedList和ArrayList 获取元素性能对比
 * @Date: Create in 4:47 PM 2018/11/6
 */
public class LinkedArrayGet {
	//迭代次数，集合大小：
	public static int ITERATION_NUM = 100;

	public static void main(String[] agrs) {
		getPerformanceCompare();
	}

	//获取性能比较：
	public static void getPerformanceCompare() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//填充ArrayList集合：
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			arrayList.add(x);
		}

		//填充LinkedList集合：
		List<Integer> linkedList = new LinkedList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			linkedList.add(x);
		}

		//创建随机数对象：
		Random random = new Random();

		System.out.println("ArrayList获取测试开始");
		long start1 = System.nanoTime();
		for (int x = 0; x < ITERATION_NUM; x++) {
			int j = random.nextInt(x + 1);
			int k = arrayList.get(j);
		}
		long end1 = System.nanoTime();
		System.out.println(end1 - start1);

		System.out.println("LinkedList获取测试开始");
		long start = System.nanoTime();
		for (int x = 0; x < ITERATION_NUM; x++) {
			int j = random.nextInt(x + 1);
			int k = linkedList.get(j);
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}
}
