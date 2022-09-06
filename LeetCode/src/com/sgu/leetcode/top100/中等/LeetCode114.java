package com.sgu.leetcode.top100.中等;

import com.sgu.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/9/3 10:06
 */
public class LeetCode114 {
    /**
     * 二叉树展开为链表
     *给你二叉树的根结点 root ，请你将它展开为一个单链表：
     * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
     * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
     * 输入：root = [1,2,5,3,4,null,6]
     * 输出：[1,null,2,null,3,null,4,null,5,null,6]
     */
    public void flatten(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        listTree(root, list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            TreeNode prev=list.get(i-1),curr=list.get(i);
            prev.left=null;
            prev.right=curr;
        }
    }
    private void listTree(TreeNode root, List<TreeNode> list){
        if (root!=null){
            list.add(root);
            listTree(root.left, list);
            listTree(root.right, list);
        }
    }

}
