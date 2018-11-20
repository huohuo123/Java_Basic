package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:29 2018/4/16
 */
public class AdvancedStrategy implements Discount {
    @Override
    public double calcPrice(double price) {
        System.out.println("高级会员折扣百分之三十");
        return price*0.7;
    }
}
