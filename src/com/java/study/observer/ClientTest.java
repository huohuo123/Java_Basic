package com.java.study.observer;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:05 2018/4/16
 */
public class ClientTest {
    public static void main(String[] args) {
        WChatServer wChatServer=new WChatServer();

        Observer zhangsan=new User("zhangsan");
        Observer lisi=new User("lisi");
        Observer wangwu=new User("wangwu");

        wChatServer.addObserver(zhangsan);
        wChatServer.addObserver(lisi);
        wChatServer.addObserver(wangwu);

        wChatServer.setInformation("I Love you ,beijing");

        wChatServer.delObserver(lisi);

        wChatServer.setInformation("I Love you, java");
    }
}
