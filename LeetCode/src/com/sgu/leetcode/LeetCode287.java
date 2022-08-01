package com.sgu.leetcode;

/**
 * @Author T-T强
 * @Date 2022/8/1 14:12
 */
public class LeetCode287 {
    //寻找重复数(中等)
    //给定一个包含n + 1 个整数的数组nums ，其数字都在[1, n]范围内（包括 1 和 n），可知至少存在一个重复的整数。
    //假设 nums 只有 一个重复的整数 ，返回这个重复的数 。
    //你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。

    //输入：nums = [1,3,4,2,2]
    //输出：2
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while (pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 2};
        System.out.println(findDuplicate(nums));
    }
}
