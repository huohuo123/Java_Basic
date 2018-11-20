package com.java.study.duoxiancheng;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 11:03 2018/4/20
 */
public class ReenterLock implements Runnable {

    public static ReentrantLock lock = new ReentrantLock();

    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            lock.lock();
            lock.lock();
            try {
                i++;
            } finally {
                lock.unlock();
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock reenterLock=new ReenterLock();
        Thread t1=new Thread(reenterLock);
        Thread t2=new Thread(reenterLock);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(i);


    }
}
