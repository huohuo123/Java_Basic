package com.java.study.java;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 18:22 2018/5/11
 */
public class RemoveNumZero {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] num=new int[]{-2,11,-4,13,-5,-2};
        int[] num2=new int[]{-10 ,1 ,2 ,3 ,4 ,-5 ,-23 ,3 ,7, -21};
        int[] nums=new int[]{5 ,-8 ,3 ,2 ,5 ,0};
        int[] num4=new int[]{-2, 11, -4, 13, -5, 2, -5, -3, 12, -9};
        getmax(nums);
    }
    public static void getmax(int[] num){
        int s=0;
        int e=0;
        int max=0;
        int temp=0;
        int ts=0;
        for(int i=0;i<num.length;i++){
            temp=temp+num[i];
            if(temp<0){
                ts=i+1;
                e=i+1;
                temp=0;
            }else{
                if(temp>max){
                    s=ts;
                    e=i;
                    max=temp;
                }
            }
        }
        System.out.println("maxsum="+max+",start:"+s+",end="+e);
    }

}
