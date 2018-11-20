package com.java.study.java;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 17:55 2018/5/11
 */
//todo 不明白中间的流程
public class StringNumberSum {
    public int numSum(String str) {
        if (str == null) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int res = 0;
        int num = 0;
        boolean posi = true;
        int cur = 0;
        for (int i = 0; i < str.length(); i++) {
            cur = chars[i] - '0';
            if (cur < 0 || cur > 9) {
                System.out.println("num="+num);
                res += num;
                System.out.println("res="+res);
                num = 0;
                if (chars[i] == '-') {
                    if (i - 1 > -1 && chars[i - 1] == '-') {
                        posi = !posi;
                    } else {
                        posi = false;
                    }
                } else {
                    posi = true;
                }
            } else {
                num = num * 10 + (posi ? cur : -cur);
            }
        }
        res += num;
        return res;

    }

    public static void main(String[] args) {
        StringNumberSum stringNumberSum=new StringNumberSum();

        System.out.println("sssss"+stringNumberSum.numSum("A1CD2E33"));
    }

}
