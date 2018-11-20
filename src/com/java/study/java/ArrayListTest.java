package com.java.study.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:HuoYaJing
 * @Description:arrayList基本功能应用
 * @Date: Create in 11:12 AM 2018/11/6
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// System.out.println("ArrayList集合初始化容量："+list.size());

		//添加功能：
		list.add("Hello");
		list.add("world");
		list.add("haha");
		list.add(2,"!");
		String[] strings={"niuniu","niiu","eee"};
		String[] strings1=Arrays.copyOf(strings,2);
		System.out.println(Arrays.toString(strings1));
		// System.out.println("ArrayList当前容量："+list.size());
		// list.clear();
		// list.remove(1);
		// list.remove("!");
		// list.removeAll(new ArrayList<String>(Arrays.asList("Hello","haha")));
		// list.set(2,"huhu");
		// System.out.println("set value:"+list.set(2,"huhu"));

		// System.out.println("ssss"+list.remove(1));

		// list.get(1);
		// System.out.println(list.get(1));
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()){
			String next=iterator.next();
			if (next.equals("haha")){
				iterator.remove();
			}
		}
		System.out.println(list.toString());

		String[] str=list.toArray(new String[]{});

		System.out.println(Arrays.toString(str));

		// for (int i=0;i<list.size();i++){
		// 	System.out.println("for value:"+list.get(i));
		// }
		//
		// for (String s:list){
		// 	System.out.println("forEach value:"+s);
		// }

		// System.out.println("ArrayList删除后容量："+list.toString());

	}
}
