package com.java.study.jvm;

/**
 * @Author:HuoYaJing
 * @Description:本地方法栈异常（创建线程导致内存溢出）
 * @Date: Create in 14:18 2018/5/14
 */
public class JavaVmStackOOM {
    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVmStackOOM javaVmStackOOM=new JavaVmStackOOM();
        javaVmStackOOM.stackLeakByThread();
    }
}
