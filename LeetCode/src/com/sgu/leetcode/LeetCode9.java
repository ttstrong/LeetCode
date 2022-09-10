package com.sgu.leetcode;

/**
 * @Author T-T强
 * @Date 2022/9/10 18:52
 */
public class LeetCode9 {
    /**
     * 回文数
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * 例如，121 是回文，而 123 不是。
     */
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }

    public static void main(String[] args) {
        int x=1101;
        System.out.println(isPalindrome(x));
    }
}
