package com.sgu.leetcode;

import java.nio.channels.FileLockInterruptionException;

/**
 * @Author T-T强
 * @Date 2022/7/7 9:15
 */
public class LeetCode136 {
//    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//    说明：
//    你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

    public int singleNumber(int[] nums) {
       int single=0;
        for (int num : nums) {
            single^=num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums={2,44,44,5,5};
        LeetCode136 leetCode136 = new LeetCode136();
        int i = leetCode136.singleNumber(nums);
        System.out.println(i);
    }
}
