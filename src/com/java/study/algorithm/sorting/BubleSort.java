package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:冒泡排序
 * @Date: Create in 16:55 2018/7/27
 */
public class BubleSort {
    public static void main(String[] args) {
        int[] array = {49,38,65,97,76,13,27,49};
        bubleSort(array,array.length);
        System.out.println(Arrays.toString(array));
    }

    static void bubleSort(int[] arr,int n){
        boolean NoSwap;
        int i,j;
        int temp;
        for (i=0;i<n-1;i++){
            //标识初始为真
            NoSwap=true;
            for (j=n-1;j>i;j--){
                //判定arr[j]<arr[j-1]是否逆置
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    //发生了交换，标志变为假
                    NoSwap=false;
                }
            }
            //如果没发生过交换，则表示已经排好序，结束算法
            if (NoSwap){
                return;
            }
        }
    }
}
