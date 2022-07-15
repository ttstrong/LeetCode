package com.sgu.leetcode.jzoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/7/15 8:39
 */
public class JZLeetCode03 {
//    找出数组中重复的数字。
//    在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
//    数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
//    输入：
//            [2, 3, 1, 0, 2, 5, 3]
//    输出：2 或 3

    //思路：用hash表。

    public int findRepeatNumber(int[] nums) {
        Set<Integer> s=new HashSet();
        for (int num : nums) {
            if (s.contains(num)){
                return num;
            }
            s.add(num);
        }
        return -1;
    }
}
