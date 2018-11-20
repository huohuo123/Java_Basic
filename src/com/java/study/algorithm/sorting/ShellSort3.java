package com.java.study.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author:HuoYaJing
 * @Description:视频代码实现
 * @Date: Create in 10:58 2018/7/18
 */
public class ShellSort3 {
    /**
     * 希尔排序
     *
     * @throws Exception
     */

    public static void main(String[] args) {
        int[] array = {16 , 11, 14 , 13};
        ShellSort3 shellSort3 = new ShellSort3();
        long start1 = System.currentTimeMillis();
        shellSort3.sort(array);
        System.out.println("shell sort time: " + (System.currentTimeMillis() - start1));
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

    }

    void sort(int[] array) {
        int h = 1;
        //假设N=7，则h=4，1两个值
        while (h < array.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            //插入排序
            int tempRecord = 0;
            for (int i = h; i < array.length; i++) {
                tempRecord = array[i];
                int j =i;
                while ( j > h - 1 && tempRecord < array[j - h]) {
                    array[j] = array[j - h];
                    j -= h;
                }
                array[j] = tempRecord;
            }

            h = (h - 1) / 3;
        }
    }


}
