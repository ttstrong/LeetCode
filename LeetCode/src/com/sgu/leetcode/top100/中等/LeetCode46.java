package com.sgu.leetcode.top100.中等;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/8/23 10:20
 */
public class LeetCode46 {
    //全排列
    //给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
    /**
     * 输入：nums = [1,2,3]
     * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     *
     * 回溯法
     */

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) return result;
        backtrack(nums, path);
        return result;
    }
    public void backtrack(int[] nums, LinkedList<Integer> path) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
        }
        for (int i =0; i < nums.length; i++) {
            // 如果path中已有，则跳过
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            backtrack(nums, path);
            path.removeLast();
        }
    }
}
