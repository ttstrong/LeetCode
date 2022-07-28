package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/7/28 8:26
 */
public class JZLeetCode34 {
    //二叉树中和为某一值的路径(中等)
    //给你二叉树的根节点 root 和一个整数目标和 targetSum ，
    // 找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return res;
    }

    void dfs(TreeNode root, int target) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        //如果target==0并且left和right为null了,说明已经到叶子节点，并且path也已经找到,将path结果加入res中
        if (target == 0 && root.left == null && root.right == null) {
            //值得注意的是，记录路径时若直接执行 res.append(path) ，则是将 path 对象加入了 res ；
            // 后续 path 改变时， res 中的 path 对象也会随之改变。
            //正确做法：res.append(list(path)) ，相当于复制了一个 path 并加入到 res 。
            res.add(new LinkedList<>(path));
        }
        dfs(root.left, target);
        dfs(root.right, target);
        //回溯
        path.removeLast();
    }
}
