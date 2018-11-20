package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:33 2018/4/16
 */

/**
 * 折扣类
 */
public class Price {
    private Discount discount;
    public Price(Discount discount){
        this.discount=discount;
    }

    /**
     * 商品价格计算
     * @param price
     * @return
     */
    public double quote(double price){
        return this.discount.calcPrice(price);
    }


}
