package com.java.study.decorator;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 3:33 PM 2018/11/29
 */
public class SynchronizeTest {
	public static void main(String[] args) {
		synchronized (SynchronizeTest.class){
			System.out.println("synchronize");
		}
	}
}
