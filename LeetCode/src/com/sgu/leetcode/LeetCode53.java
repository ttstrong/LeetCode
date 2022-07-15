package com.sgu.leetcode;


/**
 * @Author T-T强
 * @Date 2022/7/5 14:47
 */
public class LeetCode53 {

//    给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//    子数组 是数组中的一个连续部分。
//    示例 1：
//    输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//    输出：6
//    解释：连续子数组[4,-1,2,1] 的和最大，为6 。

//    示例 2：
//    输入：nums = [1]
//    输出：1

//    示例 3：
//    输入：nums = [5,4,-1,7,8]
//    输出：23

    public int maxSubArray(int[] nums) {
        //1、空间优化
//        int pre=0,maxAnt=nums[0];
//        for (int i : nums) {
//            pre=Math.max(pre+i, i);
//            maxAnt=Math.max(maxAnt, pre);
//        }
//        return maxAnt;

        //2、非空间优化
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];

        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }

        int res=dp[0];
        for (int i = 1; i < len; i++) {
            res=Math.max(res, dp[i]);
        }
        return res;
    }
    public int maxSubArray1(int[] nums) {
        int len = nums.length;
        // dp[i] 表示：以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];

        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }

        // 也可以在上面遍历的同时求出 res 的最大值，这里我们为了语义清晰分开写，大家可以自行选择
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode53 leetcode53 = new LeetCode53();
        int[] num = {1, 2, 5, -6};
        int i = leetcode53.maxSubArray(num);
        System.out.println(i);
    }
}
