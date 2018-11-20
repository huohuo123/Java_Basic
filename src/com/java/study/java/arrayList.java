package com.java.study.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:04 2018/7/1
 */
public class arrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        HashMap<String, String> hashMap = new HashMap<>();
        int[] intArray = {5, -8, 3, 2, 5, 0};
        String ss = FindGreatestSumOfSubArray(intArray);
        String[] strings = ss.split(",");
        System.out.println(strings[0] + "," + strings[1] + "," + strings[2]);
    }

    public static String FindGreatestSumOfSubArray(int[] array) {

        //定义一个当前最大值
        int currentValue = 0;
        //存储最大值
        int maxValue = 0;
        //最小值下标
        int start = 0;
        //最大值下标
        int end = 0;

        if (array.length < 0 || array == null) {
            return "";
        }
        for (int i = 0; i < array.length; i++) {
            if (currentValue < 0) {
                if (start == 0) {
                    start = i;
                }
                currentValue = array[i];
            } else {

                currentValue += array[i];
            }

            if (currentValue > maxValue) {
                maxValue = currentValue;
                end = i;
            }
        }

        return maxValue + "," + start + "," + end;
    }
}
