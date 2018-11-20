package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:仿照C++代码实现
 * @Date: Create in 22:06 2018/7/11
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {16, 11, 14, 13, 4};
        //int[] array=new int[1000000];
        //for (int i=0;i<array.length;i++){
        //    array[i]= (int) (Math.random()*1000);
        //}
        //System.out.println(Arrays.toString(array));
        long start1 = System.currentTimeMillis();
        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(array);
        System.out.println("shell sort time: " + (System.currentTimeMillis() - start1));
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }

    void shellSort(int[] array) {
        int delta;
        int n = array.length;
        for (delta = n / 2; delta > 0; delta /= 2) {
            for (int i = 0; i < delta; i++) {
                modInsSort(array, n, delta, i);
            }
        }
    }

    void modInsSort(int[] array, int n, int delta, int step) {
        for (int i = delta; i < n; i += delta) {
            for (int j = i; j >= delta; j -= delta) {
                if (j+step<n) {
                    if (array[j + step] < array[j - delta + step]) {
                        int temp;
                        temp = array[j - delta + step];
                        array[j - delta + step] = array[j + step];
                        array[j + step] = temp;
                    }
                }
            }
        }
    }
}
