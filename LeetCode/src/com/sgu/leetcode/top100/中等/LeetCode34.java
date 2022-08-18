package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/18 14:59
 */
public class LeetCode34 {

    //在排序数组中查找元素的第一个和最后一个位置

    /**
     * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回[-1, -1]。
     * 你必须设计并实现时间复杂度为O(log n)的算法解决此问题。
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     */
    //先找>=target的第一个
    //再找>target的第一个
    public int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target + 1);
        if (l == nums.length || nums[l] != target)
            return new int[]{-1, -1};
        return new int[]{l, r - 1};
    }

    //找>=target的第一个
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (r + l) / 2;
            if (nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

}
