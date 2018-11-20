package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:插入排序
 * @Date: Create in 23:06 2018/7/2
 */
public class InsertSort {
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] array = {45, 34, 78, 12, 34, 32, 29, 64, 5, 4, 3, 2, 8, 7, 4, 3, 2, 7, 9, 0, 2, 3, 44, 55, 33, 22, 66, 44, 33, 22, 1, 44, 3};

        //int[] array=new int[10];
        ////随机数赋值，只考虑随机时间
        //for (int i=0;i<array.length;i++){
        //    array[i]= (int) (Math.random()*1000);
        //}
        long start1 = System.currentTimeMillis();
        insertSort.insertSort(array);
        System.out.println("insert sort time: " + (System.currentTimeMillis() - start1));
        System.out.println(Arrays.toString(array));
    }

    void insertSort(int[] array) {
        //定义的临时变量
        int tempRecord;
        //i从1开始的原因是j=j-1
        for (int i = 1; i < array.length; i++) {
            tempRecord = array[i];
            int j = i - 1;
            //j不能为负数，根据索引判定值大小，通过临时变量进行交换
            while (j >= 0 && tempRecord < array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
                array[j + 1] = tempRecord;
            }
        }
    }

}
