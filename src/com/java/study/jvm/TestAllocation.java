package com.java.study.jvm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 16:05 2018/5/15
 */
public class TestAllocation {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("hello","霍霍");
        map.put("what","you are happy");
        System.out.println(map.get("hello").length());
    }
}
