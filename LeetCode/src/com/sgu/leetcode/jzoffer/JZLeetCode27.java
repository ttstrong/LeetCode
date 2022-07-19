package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

import java.util.Stack;

/**
 * @Author T-T强
 * @Date 2022/7/19 8:37
 */
public class JZLeetCode27 {
    //    请完成一个函数，输入一个二叉树，该函数输出它的镜像。
    //    输入：root = [4,2,7,1,3,6,9]
    //    输出：[4,7,2,9,6,3,1]
    public TreeNode mirrorTree(TreeNode root) {
        //递归
//        if (root == null) return null;
//        TreeNode left = mirrorTree(root.left);
//        TreeNode right = mirrorTree(root.right);
//        root.right = left;
//        root.left = right;
//        return root;

        //栈
        if (root == null) return null;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            if (node.left!=null) stack.push(node.left);
            if (node.right!=null) stack.push(node.right);
            //交换左右节点
            TreeNode tmp=node.left;
            node.left=node.right;
            node.right=tmp;
         }
        return root;

    }
}
