package com.sgu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/9/3 11:19
 */
public class LeetCode144 {
    //二叉树的前序遍历
    /**
     * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
     */
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        } else {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }
}
