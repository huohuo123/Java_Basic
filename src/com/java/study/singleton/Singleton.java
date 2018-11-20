package com.java.study.singleton;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 11:00 2018/4/12
 */
public class Singleton {
    private static Singleton singleton=null;

    private Singleton(){

    };

    public static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
