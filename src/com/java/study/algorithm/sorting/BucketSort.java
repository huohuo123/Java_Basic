package com.java.study.algorithm.sorting;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 11:05 AM 2018/11/3
 */
public class BucketSort {

	public static void main(String[] args) {
		int [] arrays = {7,3,8,9,6,1,8,1,2};
		int [] temp = new int [9];
		int [] count = new int [10];
		for (int i =0 ;i <9;i++){
			temp[i]=arrays[i];
		}
		for (int i =0 ;i <10;i++){
			count[i] =0 ;

		}

		for(int i=0;i<9;i++){
			count[arrays[i]]++;
		}
		for(int i =1;i<10;i++){
			count[i] = count[i-1]+count[i];

		}

		for(int i =8;i>=0;i--){
			arrays[--count[temp[i]]] =temp[i];
		}

		for(int i =0 ;i <9;i++){
			System.out.println(arrays[i]);
		}

	}

}
