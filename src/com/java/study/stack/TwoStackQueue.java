package com.java.study.stack;

import java.util.Stack;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 14:08 2018/5/10
 */
public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    //在压入栈中存数据
    public void add(int pushInt) {
        stackPush.push(pushInt);
    }

    //在弹出栈中存数据
    public int poll() {
        if (stackPop.empty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                //将弹出栈中依次放入压入栈数据
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }else if (stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

}
