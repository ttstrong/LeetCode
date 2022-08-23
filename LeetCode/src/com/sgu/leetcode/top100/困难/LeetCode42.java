package com.sgu.leetcode.top100.困难;

import java.util.Stack;

/**
 * @Author T-T强
 * @Date 2022/8/23 8:27
 */
public class LeetCode42 {
    //接雨水

    /**
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * 输出：6
     * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
     * 不同点：
     * peek 不会改变栈的值(不删除栈顶的值)
     * pop会把栈顶的值删除。
     */
    public static int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current < height.length) {
            //如果栈不空并且当前指向的高度大于栈顶高度就一直循环
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                //取出要出栈的元素
                int h = height[stack.peek()];
                stack.pop();
                //栈空停止循环
                if (stack.empty()) {
                    break;
                }
                //两堵墙之前的距离
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + distance * (min - h);
            }
            //当前指向的墙入栈
            stack.push(current);
            current++;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
