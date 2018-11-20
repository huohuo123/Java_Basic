package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:归并排序
 * @Date: Create in 9:46 AM 2018/10/27
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] array = {25, 34,45, 32, 78, 12, 34, 64};
		int[] tempArray = new int[8];
		sort(array, tempArray, 0, 7);
		System.out.println(Arrays.toString(array));
	}

	static void sort(int[] array, int[] tempArray, int left, int right) {
		int middle = 0;
		if (left < right) {
			middle = (left + right) / 2;
			sort(array, tempArray, left, middle);
			sort(array, tempArray, middle+1, right);
			merge(array, tempArray, left, right, middle);
		}
	}

	static void merge(int[] array, int[] tempArray, int left, int right, int middle) {
		int i = 0;
		int j = 0;
		int index1 = 0;
		int index2 = 0;
		for (j = left; j <= right; j++) {
			tempArray[j] = array[j];
		}
		index1 = left;
		index2 = middle + 1;
		i = left;
		while (index1 <= middle && index2 <= right) {
			if (tempArray[index1] <= tempArray[index2]) {
				array[i++] = tempArray[index1++];
			} else {
				array[i++] = tempArray[index2++];
			}
		}
		while (index1 <= middle) {
			array[i++] = tempArray[index1++];
		}
		while (index2 <= right) {
			array[i++] = tempArray[index2++];
		}
		// System.out.println("array value="+Arrays.toString(array));
		System.out.println("tempArray value="+Arrays.toString(tempArray));
	}
}
