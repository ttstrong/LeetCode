package com.sgu.leetcode.jzoffer;

import com.sun.tools.javac.Main;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/7/15 10:22
 */
public class JZLeetCode53_II {
    //53 - II. 0～n-1中缺失的数字
    //一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
    //在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
    public int missingNumber(int[] nums) {
//        if(nums[0]==0 && nums.length==1) return 1;
//        if(nums[0]==1 && nums.length==1) return 0;
//        if(nums[0]>1 && nums.length==1) return nums[0]+1;
//        Set<Integer> set=new HashSet<>();
//        int n=0;
//        for (int num : nums) {
//           set.add(num);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if (set.add(i)){
//                n=i;
//            }
//        }
//        return n;

        //二分法
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


}


