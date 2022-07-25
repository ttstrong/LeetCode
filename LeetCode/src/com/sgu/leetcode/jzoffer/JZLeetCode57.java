package com.sgu.leetcode.jzoffer;

import java.util.Arrays;

/**
 * @Author T-T强
 * @Date 2022/7/25 9:33
 */
public class JZLeetCode57 {

    //和为s的两个数字
    //输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。

    //输入：nums = [2,7,11,15], target = 9
    //输出：[2,7] 或者 [7,2]
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right =nums.length - 1;
        int[] arr=new int[2];
        while (left<right){
            int sum=nums[left]+nums[right];
            if (sum>target) right--;
            else if (sum<target) left++;
            else {
                arr[0]=nums[left];
                arr[1]=nums[right];
                return arr;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        JZLeetCode57 jzLeetCode57 = new JZLeetCode57();
        System.out.println(Arrays.toString(jzLeetCode57.twoSum(nums, target)));
    }
}
