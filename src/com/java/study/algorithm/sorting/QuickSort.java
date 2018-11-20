package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:快速排序
 * @Date: Create in 17:55 2018/7/27
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


    static void quickSort(int[] array, int low, int high) {
        int temp;
        int i = low, j = high;
        if (low < high) {
            temp = array[i];
            while (i < j) {
                while (j > i && array[j] >= temp) {
                    System.out.println("1" + Arrays.toString(array));
                    --j;
                }
                if (i < j) {
                    System.out.println("2" + Arrays.toString(array));
                    array[i] = array[j];
                    ++i;
                }
                while (i < j && array[i] < temp) {
                    System.out.println("3" + Arrays.toString(array));
                    ++i;
                }
                if (i < j) {
                    System.out.println("4" + Arrays.toString(array));
                    array[j] = array[i];
                    --j;
                }
            }
            array[i] = temp;
            quickSort(array, low, i - 1);
            quickSort(array, i + 1, high);
        }
    }
}
