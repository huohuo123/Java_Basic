package com.java.study.stack;

import com.java.study.strategies.Price;
import sun.plugin2.message.GetAppletMessage;

import java.util.Stack;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:41 2018/5/10
 */
public class myStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public myStack1() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public int push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum < this.getMin()) {
            this.stackMin.push(newNum);
        } else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
        return this.stackMin.peek();
    }

    public int getPop(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return this.stackMin.pop();
    }

    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        //返回栈顶元素
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        myStack1 myStack1=new myStack1();
        int[] stackInt = new int[]{3, 2, 5, 6, 4};
        for (int stackOne:stackInt){
            System.out.println("顺序依次为"+myStack1.push(stackOne));
        }

    }
}
