package com.java.study.duoxiancheng;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 14:20 2018/6/29
 */
public class CurrentHashMapDemo {

    public static void main(String[] args) {
        //解析日期
        String dateStr= "2016年10月25日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date= LocalDate.parse(dateStr, formatter);

        //日期转换为字符串
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm");
        String nowStr = now .format(format);
        System.out.println(nowStr);

        //ThreadLocal来限制SimpleDateFormat
        //System.out.println(format(new Date()));

    }

}
