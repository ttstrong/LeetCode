package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

/**
 * @Author T-T强
 * @Date 2022/7/19 9:04
 */
public class JZLeetCode28 {

//    请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
//    例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//    输入：root = [1,2,2,3,4,4,3]
//    输出：true
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check(root,  root);
    }

    boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        return l.val == r.val && check(l.left, r.right) && check(l.right,  r.left);
    }
}
