package com.sgu.leetcode;

/**
 * @Author T-T强
 * @Date 2022/7/9 12:03
 */
public class LeetCode338 {
    //给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。

    public int[] countBits(int n) {
        int[] nums=new int[n+1];
        for (int i = 0; i <= n; i++) {
            nums[i]=Integer.bitCount(i);
        }
        return nums;
    }
}
