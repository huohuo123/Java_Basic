package com.java.study.observer;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 14:25 2018/4/16
 */

/**
 * 抽象观察者
 */
public interface Observer {
    //定义了一个update()方法，当被观察者调用notifyObserver()方法时，观察者的update()方法会被回调。
    public void  update(String info);
}
