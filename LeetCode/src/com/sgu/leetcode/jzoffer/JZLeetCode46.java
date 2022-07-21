package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/21 8:45
 */
public class JZLeetCode46 {
    //把数字翻译成字符串
    //给定一个数字，我们按照如下规则把它翻译为字符串：
    // 0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
    // 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
    public int translateNum(int num) {
        int n = 1, m = 1;
        while (num > 9) {
            int tmp = (num % 100 < 26 && num % 100 > 9) ? m + n : n;
            m = n;
            n = tmp;
            num = num / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        int num = 12256;
        JZLeetCode46 jzLeetCode46 = new JZLeetCode46();
        jzLeetCode46.translateNum(num);
    }
}
