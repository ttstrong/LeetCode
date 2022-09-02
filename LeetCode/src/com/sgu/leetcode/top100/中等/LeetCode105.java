package com.sgu.leetcode.top100.中等;

import com.sgu.leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author T-T强
 * @Date 2022/9/2 9:36
 */
public class LeetCode105 {
    //从前序与中序遍历序列构造二叉树
    // 给定两个整数数组preorder 和 inorder，其中preorder 是二叉树的先序遍历，
    // inorder是同一棵树的中序遍历，请构造二叉树并返回其根节点。
    /**
     * 输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
     * 输出: [3,9,20,null,null,15,7]
     */
    int rootIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return buildTree(map,0,preorder.length - 1,preorder);
    }

    public TreeNode buildTree(Map<Integer,Integer> map,int left,int right,int[] preorder){
        if(left <= right){
            int rootVal = preorder[rootIndex];
            TreeNode root = new TreeNode(rootVal);
            rootIndex++;
            root.left = buildTree(map,left,map.get(rootVal) - 1,preorder);
            root.right = buildTree(map,map.get(rootVal) + 1,right,preorder);
            return root;
        }else{
            return null;
        }
    }
}
