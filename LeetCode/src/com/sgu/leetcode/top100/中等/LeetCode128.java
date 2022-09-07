package com.sgu.leetcode.top100.中等;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/9/7 8:41
 */
public class LeetCode128 {
    /**
     * 最长连续序列
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为O(n) 的算法解决此问题。
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res=0;
        for (int num : set) {
            if (!set.contains(num-1)){
                int cur=num;
                //以当前数cur向后枚举
                while (set.contains(cur+1)) cur++;
                res=Math.max(res, cur-num+1);
            }
        }
        return res;
    }
}
