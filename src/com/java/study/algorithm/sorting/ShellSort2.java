package com.java.study.algorithm.sorting;

/**
 * @Author:HuoYaJing
 * @Description:自定义+视频代码优化
 * @Date: Create in 17:42 2018/7/17
 */
public class ShellSort2 {
    public static void main(String[] args) {
        int[] array=new int[100000000];
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*1000);
        }
        //int[] array = {45, 34, 78, 12, 34, 32, 29, 64, 5, 4, 3, 2, 8, 7, 4, 3, 2, 7, 9, 0, 2, 3, 44, 55, 33, 22, 66, 44, 33, 22, 1, 44, 3};
        long start1 = System.currentTimeMillis();
        ShellSort2 shellSort = new ShellSort2();
        //System.out.println("before:" + Arrays.toString(array));
        shellSort.shellSort(array);
        System.out.println("shell sort time: " + (System.currentTimeMillis() - start1));
        //System.out.println("after:" + Arrays.toString(array));
    }

    void shellSort(int[] array) {
        int delta;
        int n = array.length;
        int ii = 0;
        for (delta = n / 2; delta > 0; delta /= 2) {
                ii++;
                int tempRecord = 0;
            //delta=delta-1;
            //System.out.println("次数：" + ii);
            for (int i = delta; i < array.length; i++) {

                    tempRecord = array[i];
                    int j = i;
                    while (j > delta - 1 && tempRecord < array[j - delta]) {
                        array[j] = array[j - delta];
                        j -= delta;
                    }
                    array[j] = tempRecord;
                }

                //System.out.println("delta :" + delta + ";array:" + Arrays.toString(array));

        }
    }

}
