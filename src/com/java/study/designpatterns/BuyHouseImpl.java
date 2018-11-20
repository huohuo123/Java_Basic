package com.java.study.designpatterns;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:40 2018/8/7
 */
public class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse(String name) {
        System.out.println(name + "说我要买房");
    }
}
