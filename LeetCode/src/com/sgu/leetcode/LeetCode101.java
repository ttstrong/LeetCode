package com.sgu.leetcode;

/**
 * @Author T-T强
 * @Date 2022/7/6 15:13
 */
public class LeetCode101 {
//    给你一个二叉树的根节点 root ， 检查它是否轴对称。

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p,TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q ==null){
            return false;
        }
        if (check(p.left, q.right)&&check(q.left, p.right)&&p.val==q.val){
            return true;
        }else {
            return false;
        }
    }
}
