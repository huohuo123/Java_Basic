package com.java.study.java.classLoader;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 3:56 PM 2018/11/19
 */
public class ClassLoaderTree {
	public static void main(String[] args) {
		ClassLoader classLoader=ClassLoaderTree.class.getClassLoader();
		//采用递归的方式输出
		while (classLoader!=null){
			System.out.println(classLoader.toString());
			classLoader=classLoader.getParent();
		}
	}
}
