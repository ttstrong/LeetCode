package com.sgu.leetcode.排序.中等;

import java.util.Arrays;

/**
 * @Author T-T强
 * @Date 2022/8/5 11:21
 */
public class LeetCode16 {
    //最接近的三数之和(双指针)
    //给你一个长度为 n 的整数数组nums和 一个目标值target。请你从 nums 中选出三个整数，使它们的和与target最接近。
    //返回这三个数的和。
    //假定每组输入只存在恰好一个解。
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start=i+1,end=nums.length-1;
            while (start<end){
                int sum=nums[start]+nums[end]+nums[i];
                if (Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if (sum>target)
                    end--;
                else if (sum<target) start++;
                else return ans;
            }
        }
        return ans;
    }
}
