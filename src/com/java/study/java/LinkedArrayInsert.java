package com.java.study.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:HuoYaJing
 * @Description:LinkedList和ArrayList插入性能对比
 * @Date: Create in 3:00 PM 2018/11/6
 */
public class LinkedArrayInsert {
	//迭代次数
	public static int ITERATION_NUM = 10000000;

	public static void main(String[] agrs) {
		insertPerformanceCompare();
	}

	//新增性能比较：
	public static void insertPerformanceCompare() {

		System.out.println("LinkedList新增测试开始");
		long start = System.nanoTime();
		List<Integer> linkedList = new LinkedList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			linkedList.add(x);
		}
		long end = System.nanoTime();
		System.out.println("linkedList time one:"+(end - start));
		long startInsert=System.nanoTime();
		linkedList.add(0,11);
		linkedList.add(10,11);
		linkedList.add(100,11);
		linkedList.add(1000,11);
		linkedList.add(10000,11);
		linkedList.add(100000,11);
		linkedList.add(1000000,11);

		linkedList.remove(0);
		linkedList.remove(10);
		linkedList.remove(100);
		linkedList.remove(1000);
		linkedList.remove(10000);
		linkedList.remove(100000);
		linkedList.remove(1000000);

		long endInsert=System.nanoTime();
		System.out.println("linkedList time two:"+(endInsert-startInsert));

		System.out.println("ArrayList新增测试开始");
		long startArray = System.nanoTime();
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			arrayList.add(x);
		}
		long endArray = System.nanoTime();
		System.out.println("arrayList time one:"+(endArray - startArray));

		long startArrayInsert=System.nanoTime();

		arrayList.add(0,11);
		arrayList.add(10,11);
		arrayList.add(100,11);
		arrayList.add(1000,11);
		arrayList.add(10000,11);
		arrayList.add(100000,11);
		arrayList.add(1000000,11);
		long endArrayInsert=System.nanoTime();
		System.out.println("arrayList time two:"+(endArrayInsert-startArrayInsert));
	}
}
