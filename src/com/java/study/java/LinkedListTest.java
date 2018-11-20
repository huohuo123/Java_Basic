package com.java.study.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 3:58 PM 2018/11/6
 */
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list=new LinkedList<>();

		list.add("my");
		list.add("name");
		list.add("is");
		list.add("huohuo");
		list.add(2,"niuniu");
		System.out.println("当前容量："+list.size());

		// list.set(0,"his");
		// list.set(3,"huhu");
		// System.out.println("当前值："+list.toString());

		// String element=list.get(3);
		// System.out.println("对应值："+element);

		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()){
			String next=iterator.next();
			System.out.println("循环："+next);
		}

		// boolean isEmpty=list.isEmpty();
		// System.out.println("是否为空："+isEmpty);
		//
		// boolean isContains=list.contains("huohuo");
		// System.out.println("是否包含元素："+isContains);
		//
		// int size=list.size();

		// list.remove(0);
		// list.remove("is");
		// list.clear();
		// System.out.println(list.size());
		// boolean isEmpty=list.isEmpty();
		// System.out.println("是否为空："+isEmpty);




	}



}
