package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:堆排序
 * @Date: Create in 10:57 2018/7/26
 */
public class DuiSort {

    public static void main(String[] args) {
        int[] array = {49,38,65,97,76,13,27,49};
        heapSort(array,array.length);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 堆排序的主过程
     * @param array
     * @param n
     */
    static void heapSort(int[] array, int n) {

        int i;
        int temp;
        for (i = n / 2 - 1; i >= 0; --i) {
            sift(array, i, n - 1);
        }
        for (i = n - 1; i > 0; --i) {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            sift(array, 0, i - 1);
        }

    }

    /**
     * 调整函数
     * @param arr
     * @param low
     * @param high
     */
    static void sift(int arr[], int low, int high) {
        int i = low;
        int j = 2 *i  + 1;
        int temp = arr[i];
        while (j <= high) {
            //判定左孩子结点和右孩子结点的大小，进而决定跟结点到底与谁作比较
            if (j < high && arr[j] < arr[j + 1]) {
                ++j;
            }
            if (temp < arr[j]) {
                arr[i] = arr[j];
                i = j;
                j = 2 * i + 1;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }
}
