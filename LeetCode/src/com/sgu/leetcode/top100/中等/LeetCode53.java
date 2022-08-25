package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/25 8:27
 */
public class LeetCode53 {
    /**
     * 最大子数组和
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 子数组 是数组中的一个连续部分。
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     */
    public static int maxSubArray(int[] nums) {
//        int n = 0, maxNums = nums[0];
//        for (int num : nums) {
//            n = Math.max(num + n, num);
//            maxNums = Math.max(n, maxNums);
//        }
//        return maxNums;
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }

        int res = nums[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(maxSubArray(nums));
    }

}
