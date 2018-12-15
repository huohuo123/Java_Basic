package com.java.study.java.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:HuoYaJing
 * @Description:字符串匹配
 * @Date: Create in 2:26 PM 2018/12/15
 */
public class PatternString {
	public static void main(String[] args) {
		//目标字符串
		String[] target ={"J","I","M","B","A","L","_","I","B","B","A","R","B","E","R","W","_"};
		//待查找字符串
		String[] pattern = {"B","A"};
		List<Integer> result = compareAndFind(target, pattern);
		//包含几个查找的字符串，且其开始的位置
		System.out.println("num="+result.size()+";position="+result.toString());
	}

	/**
	 * 通过蛮力法解决字符串匹配问题
	 * @param target
	 * @param pattern
	 * @return
	 */
	public static List<Integer> compareAndFind(String[] target, String[] pattern) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < target.length - pattern.length; i++) {
			int j = 0;
			//用需查找的第一个字母和目标字符串一一比较
			while (j < pattern.length && pattern[j] == target[i + j]) {
				//依次对j加一，一一比较
				j = j + 1;
				//若pattern都依次查到，则证明存在该字符串
				if (j == pattern.length) {
					result.add(i);
				}
			}
		}
		return result;
	}
}
