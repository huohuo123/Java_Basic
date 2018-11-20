package com.java.study.designpatterns;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:42 2018/8/7
 */
public class ProxyStaticTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse("huohuo");
    }
}
