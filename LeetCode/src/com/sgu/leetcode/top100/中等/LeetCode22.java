package com.sgu.leetcode.top100.中等;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/8/13 14:02
 */
public class LeetCode22 {
    //括号生成
    //数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    //输入：n = 3
    //输出：["((()))","(()())","(())()","()(())","()()()"]
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        dfs("", n, n, res);
        return res;
    }

    /**
     * @param s 当前递归得到的结果
     * @param left   左括号还有几个可以使用
     * @param right  右括号还有几个可以使用
     * @param res    结果集
     */
    private void dfs(String s, int left, int right, List<String> res) {
        // 因为每一次尝试，都使用新的字符串变量，所以无需回溯
        // 在递归终止的时候，直接把它添加到结果集即可
        if (left == 0 && right == 0){
            res.add(s);
            return;
        }
        // 剪枝（左括号可以使用的个数严格大于右括号可以使用的个数，才剪枝，注意这个细节）
        if (left>right){
            return;
        }
        if (left>0){
            dfs(s+"(", left-1, right, res);
        }
        if (right>0){
            dfs(s+")", left, right-1, res);
        }
    }

}
