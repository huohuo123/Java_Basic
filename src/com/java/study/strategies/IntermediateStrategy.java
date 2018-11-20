package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:28 2018/4/16
 */
public class IntermediateStrategy implements Discount {
    @Override
    public double calcPrice(double price) {
        System.out.println("中级会员折扣百分之二十");
        return price*0.8;
    }
}
