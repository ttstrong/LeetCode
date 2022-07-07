package com.sgu.leetcode;

import java.util.Deque;

/**
 * @Author T-T强
 * @Date 2022/7/6 15:44
 */
public class LeetCode104 {
    //    给定一个二叉树，找出其最大深度。
//
//    二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
//    说明:叶子节点是指没有子节点的节点。
//
//    示例：
//    给定二叉树 [3,9,20,null,null,15,7]
//      深度：3
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int leftHeight=maxDepth(root.left);
            int rightHeight=maxDepth(root.right);
            return Math.max(leftHeight, rightHeight);
        }
    }


}
