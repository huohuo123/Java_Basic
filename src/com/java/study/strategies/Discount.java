package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 16:52 2018/4/12
 */

/**
 * 抽象折扣类
 */
public interface Discount {

    public double calcPrice(double price);
}
