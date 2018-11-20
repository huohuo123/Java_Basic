package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:47 2018/4/16
 */
public class AdvancedGift implements Gift {

    @Override
    public int gift(int number) {
        return number*2;
    }
}
