package com.sgu.leetcode.top100.中等;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/8/19 8:42
 */
public class LeetCode39 {
    /**
     * 组合总和
     * 给你一个 无重复元素 的整数数组candidates 和一个目标整数target，
     * 找出candidates中可以使数字和为目标数target 的所有不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
     * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
     * 对于给定的输入，保证和为target 的不同组合数少于 150 个。
     * 输入：candidates = [2,3,6,7], target = 7
     * 输出：[[2,2,3],[7]]
     * 解释：
     * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
     * 7 也是一个候选， 7 = 7 。
     * 仅有这两种组合。
     * 回溯法
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combined = new ArrayList<>();
        dfs(candidates, target, res, combined, 0);
        return res;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> combined, int ids) {
        //数组已经遍历完了
        if (ids == candidates.length) return;
        if (target == 0) {
            res.add(new ArrayList<>(combined));
            return;
        }
        //跳过当前数
        dfs(candidates, target, res, combined, ids + 1);
        //选择当前数
        if (target - candidates[ids] >= 0) {
            combined.add(candidates[ids]);
            dfs(candidates, target - candidates[ids], res, combined, ids);
            //回溯
            combined.remove(combined.size() - 1);
        }
    }
}
