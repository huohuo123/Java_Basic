package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:24 2018/4/16
 */
public class PrimaryStrategy implements Discount {
    @Override
    public double calcPrice(double price) {
        System.out.println("初级会员折扣百分之十");
        return price*0.9;
    }
}
