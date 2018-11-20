package com.java.study.observer;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 14:28 2018/4/16
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者，微信服务号
 */
public class WChatServer implements Subject {

    private List<Observer> list;
    private String message;


    public WChatServer() {
        list = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer obj) {
        list.add(obj);
    }

    @Override
    public void delObserver(Observer obj) {
        if (!list.isEmpty()) {
            list.remove(obj);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInformation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
