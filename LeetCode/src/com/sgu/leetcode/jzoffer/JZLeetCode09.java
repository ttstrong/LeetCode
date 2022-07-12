package com.sgu.leetcode.jzoffer;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author T-T强
 * @Date 2022/7/12 8:37
 */
public class JZLeetCode09 {
//    用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
//    分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
//    输入：
//            ["CQueue","appendTail","deleteHead","deleteHead"]
//            [[],[3],[],[]]
//    输出：   [null,null,3,-1]

//    思路：
//    将一个栈当作输入栈，用于压入appendTail 传入的数据；另一个栈当作输出栈，用于deleteHead 操作。
//    每次 deleteHead 时，若输出栈为空则将输入栈的全部数据依次弹出并压入输出栈，这样输出栈从栈顶往栈底的顺序就是队列从队首往队尾的顺序。

    //第一种：大佬解法
//    LinkedList<Integer> A, B;
//    public CQueue() {
//        A = new LinkedList<Integer>();
//        B = new LinkedList<Integer>();
//    }
//    public void appendTail(int value) {
//        A.addLast(value);
//    }
//    public int deleteHead() {
//        if(!B.isEmpty()) return B.removeLast();
//        if(A.isEmpty()) return -1;
//        while(!A.isEmpty())
//            B.addLast(A.removeLast());
//        return B.removeLast();
//    }

    Deque<Integer> in,out;

    public CQueue() {
        in=new ArrayDeque<Integer>();
        out=new ArrayDeque<Integer>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (out.isEmpty()){
            if (in.isEmpty()){
                return -1;
            }
            output();
        }
        //如果输入栈不为空。
        return out.pop();
    }

    public void output(){
        while (!in.isEmpty()){
            out.push(in.pop());
        }
    }

}
