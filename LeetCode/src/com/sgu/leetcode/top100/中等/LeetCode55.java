package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/25 9:48
 */
public class LeetCode55 {
    //跳跃游戏

    /**
     * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * 判断你是否能够到达最后一个下标。
     * 输入：nums = [2,3,1,1,4]
     * 输出：true
     * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
     */


    public static boolean canJump(int[] nums) {
        if (nums == null) return false;
        int k = 0;
        for (int i = 0; i <= k; i++) {
            //记录当前位置所能跳到的最远距离
            int temp = nums[i] + i;
            k = Math.max(k, temp);
            if (k >= nums.length - 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
