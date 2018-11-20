package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:52 2018/4/16
 */
public class GiftNumber {

    private Gift gift;

    public GiftNumber(Gift gift) {
        this.gift = gift;
    }

    public int count(int number){
        return this.gift.gift(number);
    }
}
