package com.java.study.designpatterns;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:40 2018/8/7
 */
public class BuyHouseProxy implements BuyHouse {


    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse(String name) {
        System.out.println("买房前准备");
        buyHouse.buyHouse(name);
        System.out.println("买房后装修");

    }
}
