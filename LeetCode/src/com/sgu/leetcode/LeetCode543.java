package com.sgu.leetcode;

import java.util.TreeMap;

/**
 * @Author T-T强
 * @Date 2022/7/11 8:54
 */
public class LeetCode543 {
//    给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。

    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right=maxDepth(root.right);
        max=Math.max(max,left+right);
        return Math.max(left, right)+1;
    }
}
