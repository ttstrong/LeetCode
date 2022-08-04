package com.sgu.leetcode.排序.简单;

import java.util.Arrays;

/**
 * @Author T-T强
 * @Date 2022/8/3 10:11
 */
public class LeetCode268 {
    //丢失的数字
    //给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
    //输入：nums = [3,0,1]
    //输出：2
    //解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
    public int missingNumber(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        int n=0;
//        for (int num : nums) {
//            set.add(num);
//        }
//        for (int i = 0; i < nums.length+1; i++) {
//            if (set.add(i)) n=i;
//        }
//        return n;

        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i]!=i) return i;
        }
        return n;
    }
}
