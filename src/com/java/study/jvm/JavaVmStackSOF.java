package com.java.study.jvm;

/**
 * @Author:HuoYaJing
 * @Description:虚拟机栈异常（线程请求的栈深度大于虚拟机所允许的最大深度）
 * @Date: Create in 11:15 2018/5/14
 */
public class JavaVmStackSOF {
    private int stackLength=1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVmStackSOF javaVmStackSOF=new JavaVmStackSOF();
        try {
            javaVmStackSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length="+javaVmStackSOF.stackLength);
            throw e;
        }

    }
}
