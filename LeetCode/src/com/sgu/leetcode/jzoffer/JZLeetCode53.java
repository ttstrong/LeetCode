package com.sgu.leetcode.jzoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/7/15 9:17
 */
public class JZLeetCode53 {
    //在排序数组中查找数字 I
    //统计一个数字在排序数组中出现的次数。
    //输入: nums = [5,7,7,8,8,10], target = 8
    //输出: 2
    //思路：二分法修改

    public int search(int[] nums, int target) {
//        int count=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==target)
//                count++;
//        }
//        return count;


        //搜索右边界
//        int i=0,j=nums.length-1;
//        while (i<=j){
//            //中点
//            int m=(i+j)/2;
//            //大于中点则在右边i=m+1;
//            if (nums[m]<=target) i=m+1;
//            else j=m-1;
//        }
//        int right = i;
//        //j是右边界,target不等于右边界所有值则返回0
//        if (j>=0 && nums[j]!=target) return 0;
//
//        //搜索左边界
//        i=0;j=nums.length-1;
//        while (i<=j){
//            int m=(i+j)/2;
//            if (nums[m]<target) i=m+1;
//            else j=m-1;
//        }
//        int left=j;
//        return right-left-1;

        return helper(nums, target) - helper(nums, target - 1);
    }
    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
