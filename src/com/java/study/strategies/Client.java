package com.java.study.strategies;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:37 2018/4/16
 */
public class Client {

    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        Discount discount = new IntermediateStrategy();
        //创建环境
        Price price = new Price(discount);
        //计算环境
        double quote = price.quote(300);

        //是否赠送礼物
        Gift gift=new AdvancedGift();

        GiftNumber giftNumber=new GiftNumber(gift);

        int count=giftNumber.count(1);

        System.out.println("图书的最终价格为：" + quote);

        System.out.println("赠送的小礼物："+count);

    }
}
