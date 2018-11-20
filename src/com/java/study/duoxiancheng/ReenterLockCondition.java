package com.java.study.duoxiancheng;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 16:40 2018/4/20
 */
public class ReenterLockCondition implements Runnable {

    public static ReentrantLock lock=new ReentrantLock();
    public static Condition condition=lock.newCondition();



    @Override
    public void run() {
        try {
            lock.lock();
            condition.await();
            System.out.println("thread is go on");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLockCondition r1=new ReenterLockCondition();
        Thread t1=new Thread(r1);
        t1.start();
        Thread.sleep(2000);
        lock.lock();
        condition.signal();
        lock.unlock();
    }
}
