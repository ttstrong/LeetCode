package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/20 9:06
 */
public class JZLeetCode42 {

    //同leetcode53

    //输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
    //要求时间复杂度为O(n)。

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAnt = nums[0];
        for (int i : nums) {
            pre = Math.max(pre + i, i);
            maxAnt = Math.max(maxAnt, pre);
        }
        return maxAnt;
    }
}
