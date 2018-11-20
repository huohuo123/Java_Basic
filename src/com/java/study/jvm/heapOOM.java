package com.java.study.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:HuoYaJing
 * @Description:JAVA堆溢出,设置-Xms20m -Xmx20m
 * 将最大值和最小值都设置为20，避免自动扩展
 * -XX:+HeapDumpOnOutOfMemoryError，JVM会在遇到OutOfMemoryError时拍摄一个“堆转储快照”，并将其保存在一个文件中。
 * @Date: Create in 10:59 2018/5/14
 */
public class heapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
