package com.java.study.java;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TreeSet;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 11:46 2018/7/7
 */
public class Listbing{

    public static int testLengthCompare(Date a, Date b) {
        if (a == null || b == null) {
            return -1;
        }
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        Date dateBegin = new Date(year, month, day, 8, 0, 0);
        Date dateEnd = new Date(year, month, day, 20, 0, 0);
        if (a.before(dateBegin)) {
            a = dateBegin;
        }
        if (dateEnd.before(b)) {
            b = dateEnd;
        }
        return new BigDecimal(a.compareTo(b))
                .divide(new BigDecimal(1000*60*60), 0, BigDecimal.ROUND_UP)
                .intValue();
    }

    public static void main(String[] args) throws ParseException {
        String string1 = "2017-11-24 21:59:06";
        String string2="2017-11-10 21:59:03";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date a=sdf.parse(string1);
        Date b=sdf.parse(string2);
        System.out.println(testLengthCompare(a,b));
    }


}
