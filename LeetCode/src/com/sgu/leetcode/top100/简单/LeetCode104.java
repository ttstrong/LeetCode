package com.sgu.leetcode.top100.简单;

import com.sgu.leetcode.TreeNode;

/**
 * @Author T-T强
 * @Date 2022/9/2 8:42
 */
public class LeetCode104 {


    /**
     * 二叉树的最大深度
     * 给定一个二叉树，找出其最大深度。
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     * 说明: 叶子节点是指没有子节点的节点。
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftMax = maxDepth(root.left);
            int rightMax = maxDepth(root.right);
            //根节点
            return Math.max(leftMax, rightMax)+1;
        }
    }
}
