package com.java.study.java;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 09:18 2018/7/12
 */
public class HashMapTest extends Thread{
    /**
     * 类的静态变量是各个实例共享的，因此并发的执行此线程一直在操作这两个变量
     * 选择AtomicInteger避免可能的int++并发问题
     */
    private static AtomicInteger ai = new AtomicInteger(0);
    //初始化一个table长度为1的哈希表
    // private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(1);

    //如果使用ConcurrentHashMap，不会出现类似的问题
      private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>(1);

    @Override
    public void run()
    {
        while (ai.get() < 100000)
        {  //不断自增
            map.put(ai.get(), ai.get());
            ai.incrementAndGet();
        }

        System.out.println(Thread.currentThread().getName()+"线程即将结束");
    }

    public static void main(String[] args) {
        HashMapTest t0 = new HashMapTest();
        HashMapTest t1 = new HashMapTest();
        HashMapTest t2 = new HashMapTest();
        HashMapTest t3 = new HashMapTest();
        HashMapTest t4 = new HashMapTest();
        HashMapTest t5 = new HashMapTest();
        HashMapTest t6 = new HashMapTest();
        HashMapTest t7 = new HashMapTest();
        HashMapTest t8 = new HashMapTest();
        HashMapTest t9 = new HashMapTest();
        HashMapTest t10 = new HashMapTest();
        HashMapTest t11 = new HashMapTest();
        HashMapTest t12 = new HashMapTest();
        HashMapTest t13 = new HashMapTest();
        HashMapTest t14 = new HashMapTest();
        HashMapTest t15 = new HashMapTest();
        HashMapTest t16 = new HashMapTest();
        HashMapTest t17 = new HashMapTest();
        HashMapTest t18 = new HashMapTest();
        HashMapTest t19 = new HashMapTest();
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
    }
}
