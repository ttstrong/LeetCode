package com.sgu.leetcode.jzoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/7/31 18:41
 */
public class JZLeetCode61 {

    //扑克牌中的顺子
    //从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
    // 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。

    public boolean isStraight(int[] nums) {
        //统计0的个数
//        int count = 0;
//        Arrays.sort(nums);
//        for (int i = 0; i < 4; i++) {
//            if (nums[i] == 0) count++;
//            else if (nums[i] == nums[i + 1]) return false;
//        }
//        return nums[4] - nums[count] < 5;

        //最大值-最小值<5，则说明是顺序的
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) continue;
            max = Math.max(max, num);
            min = Math.min(min, num);
            //如果数字重复则提前退出
            if (set.contains(num)) return false;
            set.add(num);
        }
        return max - min < 5;
    }

}
