package com.java.study.algorithm.sorting;

import static java.lang.Math.log;

/**
 * @Author:HuoYaJing
 * @Description:c++希尔排序
 * @Date: Create in 20:40 2018/7/28
 */
public class ShellSort4 {


    public static void main(String[] args) {
        //int[] array={45, 34, 78, 12, 34, 32, 29, 64, 5, 4, 3, 2, 8, 7, 4, 3, 2, 7, 9, 0, 2, 3, 44, 55, 33, 22, 66, 44, 33, 22, 1, 44, 3};
        int[] array=new int[100000000];
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*1000);
        }
        //int[] array = {45, 34, 78, 12, 34, 32, 29, 64, 5, 4, 3, 2, 8, 7, 4, 3, 2, 7, 9, 0, 2, 3, 44, 55, 33, 22, 66, 44, 33, 22, 1, 44, 3};
        long start1 = System.currentTimeMillis();
        shellSort(array,array.length, (int) (log((double)(array.length+1))/log((double)2)));
        //System.out.println("before:" + Arrays.toString(array));
        System.out.println("shell sort time: " + (System.currentTimeMillis() - start1));
        //排序趟数应为log2(n+1)的整数部分
        //System.out.println("end value"+Arrays.toString(array));
    }

   static void shellSort(int[] array,int n,int t)

    {
        int i;
        for(i = 1;i <= t;i++) {
            System.out.println("dk value:"+dkHibbard(t, i));
            shellInsert(array, n, dkHibbard(t, i));
        }
    }

   static void shellInsert(int array[],int n,int dk)
    {
        int i,j,temp;
        //分别向每组的有序区域插入
        for(i = dk;i < n;i++)
        {
            temp = array[i];
            //比较与记录后移同时进行
            for(j = i-dk;(j >= i % dk) && array[j] > temp;j -= dk) {
                int ss=j+dk;
                System.out.println("j value"+j+";ss value="+ss);
                array[j + dk] = array[j];
            }
            if(j != i - dk) {
                //插入
                array[j + dk] = temp;
            }
        }

        //System.out.println("dk value="+dk+";value="+Arrays.toString(array));
    }

    //计算Hibbard增量
    static int dkHibbard(int t,int k)
    {
        //pow求幂次方
        int x=t-k+1;

        return (int) (Math.pow(2,t - k + 1) - 1);
    }
}
