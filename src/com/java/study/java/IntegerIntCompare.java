package com.java.study.java;

/**
 * @Author:HuoYaJing
 * @Description:Integer和Int对比比较  没彻底懂
 * @Date: Create in 10:33 AM 2018/11/8
 */
public class IntegerIntCompare {
	public static void main(String[] args) {
		int i = 128;
		Integer i2 = 128;
		Integer i3 = new Integer(128);
		//Integer会自动拆箱为int
		System.out.println(i == i2);
		System.out.println(i == i3);

		// Integer i5=127;
		// Integer i6=127;
		// System.out.println(i5.equals(i6));

		Integer i5=128;
		Integer i6=128;
		System.out.println(i5.equals(i6));


	}
}
