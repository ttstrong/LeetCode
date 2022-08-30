package com.sgu.leetcode.top100.中等;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/8/30 8:48
 */
public class LeetCode78 {
    //子集
    //给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
    //解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
    //输入：nums = [1,2,3]
    //输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            int size=res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> sub=new ArrayList<>(res.get(i));
                sub.add(num);
                res.add(sub);
            }
        }
        return res;
    }
}
