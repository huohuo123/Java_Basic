package com.java.study.algorithm.sorting;

import java.util.Arrays;


/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 14:49 2018/7/26
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {45,34,78,12,34,32,29,64};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void selectionSort(int[] array) {
        //定义一个最小值
        int smallest;
        //定义一个临时变量
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            smallest = i;
            //循环j,找剩余数值的最小值与a[i]兑换
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }
}
