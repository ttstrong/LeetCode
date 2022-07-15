package com.sgu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/7/6 14:40
 */
public class LeetCode93 {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res=new ArrayList<Integer>();
      inorder(root, res);
      return res;
    }
    public void inorder(TreeNode root, List<Integer> res){
        if (root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public static void main(String[] args) {
    }
}
