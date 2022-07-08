package com.sgu.leetcode;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * @Author T-T强
 * @Date 2022/7/5 14:47
 */
public class LeetCode226 {
//    给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。

    public TreeNode invertTree(TreeNode root) {
        //第一种

//        if(root == null) {
//            return null;
//        }
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()){
//            TreeNode tmp=queue.poll();
//            TreeNode left = tmp.left;
//            tmp.left = tmp.right;
//            tmp.right = left;
//            if (tmp.right!=null){
//                queue.offer(root);
//            }
//            if (tmp.left!=null){
//                queue.offer(tmp.left);
//            }
//        }
//        return root;
        //第二种
        if(root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left=root.right;
        root.right=tmp;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}


