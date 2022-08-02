package com.sgu.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/8/2 10:11
 */
public class LeetCode217 {
    //存在重复元素
    //给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
