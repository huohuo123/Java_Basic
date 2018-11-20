package com.java.study.java;

/**
 * @Author:HuoYaJing
 * @Description:变形词
 * @Date: Create in 17:18 2018/5/11
 */
public class Anagram {

    public boolean idDeformation(String str1,String str2){
        if (str1==null || str2==null || str1.length()!=str2.length()){
            return false;
        }

        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        int[] map=new int[256];
        for (int i=0;i<chars1.length;i++){
            map[chars1[i]]++;
        }
        for (int i=0;i<chars2.length;i++){
            if (map[chars2[i]]--==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram anagram =new Anagram();
        String str1="silent";
        String str2="listen";
        String str3="evil";
        String str4="live";
        System.out.println(anagram.idDeformation(str1,str2));
        System.out.println(anagram.idDeformation(str3,str4));
    }
}
