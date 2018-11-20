package com.java.study.singleton;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 11:04 2018/4/12
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;

    //当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去内存中读取新值
    private volatile static ChocolateFactory uniqueInstace=null;

    private ChocolateFactory(){
        empty=true;
        boiled=true;
    }


    public static  ChocolateFactory getInstance(){
        if (uniqueInstace==null){
            synchronized (ChocolateFactory.class){
                if (uniqueInstace==null){
                    uniqueInstace=new ChocolateFactory();
                }
            }
        }
        return uniqueInstace;
    }

    public void fill(){
        if (empty){
            //添加原料动作
            empty=false;
            boiled=false;
        }
    }
}
