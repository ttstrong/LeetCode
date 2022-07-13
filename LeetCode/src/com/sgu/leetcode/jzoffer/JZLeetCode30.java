package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.Solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author T-T强
 * @Date 2022/7/12 9:27
 */
public class JZLeetCode30 {
//    定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
    //MinStack minStack = new MinStack();
    //minStack.push(-2);
    //minStack.push(0);
    //minStack.push(-3);
    //minStack.min();   --> 返回 -3.
    //minStack.pop();
    //minStack.top();      --> 返回 0.
    //minStack.min();   --> 返回 -2.


//    Deque<Integer> a;
//    Deque<Integer> b;
//
//    /**
//     * initialize your data structure here.
//     */
//    public JZLeetCode30() {
//        a = new ArrayDeque<Integer>();
//        b = new ArrayDeque<Integer>();
//    }
//
//    public void push(int x) {
//        a.push(x);
//        if (b.isEmpty() || b.peek() >= x) {
//            b.push(x);
//        }
//    }
//
//    public void pop() {
//        int x = a.pop();
//        if (x == b.peek()) {
//            b.pop();
//        }
//    }
//
//    public int top() {
//        return a.peek();
//    }
//
//    public int min() {
//        return b.peek();
//    }


    //第二种
    //思路:
    //我们可以在每个元素 a 入栈时把当前栈的最小值 m 存储起来。在这之后无论何时，如果栈顶元素是 a，我们就可以直接返回存储的最小值 m。

    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public JZLeetCode30() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
