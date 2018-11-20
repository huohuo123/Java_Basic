package com.java.study.observer;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 14:22 2018/4/16
 */

/**
 * 抽象被观察者
 */
public interface Subject {
    void addObserver(Observer obj);

    void delObserver(Observer obj);

    void notifyObserver();
}
