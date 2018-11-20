package com.java.study.duoxiancheng;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 17:31 2018/4/20
 */
public class CyclicBarrierDemo {

    public static class Student implements Runnable {

        private String student;
        private final CyclicBarrier cyclicBarrier;

        Student(CyclicBarrier cyclicBarrier, String studentName) {
            this.cyclicBarrier = cyclicBarrier;
            this.student = studentName;
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
                doWork();
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }

        void doWork() {
            try {
                Thread.sleep(Math.abs(new Random().nextInt() % 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(student+"任务完成");
        }


    }

    public static class BarrierRun implements Runnable {

        boolean flag;
        int N;

        public BarrierRun(boolean flag, int N) {
            this.flag = flag;
            this.N = N;
        }


        @Override
        public void run() {
            if (flag) {
                System.out.println(N + "任务完成");
            } else {
                System.out.println(N + "集合完毕");
                flag=true;
            }
        }
    }

    public static void main(String[] args) {
        final  int N=10;
        Thread[] allStudent=new Thread[N];
        boolean flag=false;
        CyclicBarrier cyclicBarrier=new CyclicBarrier(N,new BarrierRun(flag,N));
        //设置屏障点，主要是为了执行方法
        System.out.println("集合队伍");
        for (int i=0;i<N;i++){
            System.out.println("学生"+i+"报道");
            allStudent[i]=new Thread(new Student(cyclicBarrier,"学生"+i));
            allStudent[i].start();
            //if (i==5){
            //    allStudent[0].interrupt();
            //}

        }


    }


}
