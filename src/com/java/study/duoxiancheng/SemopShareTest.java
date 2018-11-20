package com.java.study.duoxiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 16:54 2018/4/20
 */
public class SemopShareTest implements Runnable {


    final Semaphore semopShare = new Semaphore(5);

    @Override
    public void run() {
        try {
            semopShare.acquire(2);
            //模拟耗时操作
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId() + "done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semopShare.release(2);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        final SemopShareTest demo = new SemopShareTest();
        for (int i = 0; i < 20; i++) {
            executorService.submit(demo);
        }
    }
}
