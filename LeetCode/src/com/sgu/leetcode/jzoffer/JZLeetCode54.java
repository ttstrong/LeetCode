package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/7/28 10:54
 */
public class JZLeetCode54 {
    //二叉搜索树的第k大节点(简单)
    //给定一棵二叉搜索树，请找出其中第 k 大的节点的值。

//    int res, k;
//    public int kthLargest(TreeNode root, int k) {
//        this.k = k;
//        dfs(root);
//        return res;
//    }
//    void dfs(TreeNode root) {
//        if(root == null) return;
//        dfs(root.right);
//        if(k == 0) return;
//        //递归遍历时计数，统计当前节点的序号
//        if(--k == 0) res = root.val;
//        dfs(root.left);

    List<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        dfs(root);
        return list.get(list.size() - k);
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
