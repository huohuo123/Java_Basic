package com.java.study.observer;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:01 2018/4/16
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String info) {
        this.message = info;
        read();
    }

    public void read() {
        System.out.println(name + "收到推送消息：" + message);
    }
}
