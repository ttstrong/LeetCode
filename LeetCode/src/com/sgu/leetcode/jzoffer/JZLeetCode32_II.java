package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author T-T强
 * @Date 2022/7/18 9:26
 */
public class JZLeetCode32_II {
    //32 - II. 从上到下打印二叉树 II
    //从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
    //给定二叉树: [3,9,20,null,null,15,7],
    //                3
    //               / \
    //               9  20
    //               /  \
    //               15   7
    //            [
    //            [3],
    //            [9,20],
    //            [15,7]
    //            ]

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            //遍历同一层并存入list，以size做判断，同size就是同一层。
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
