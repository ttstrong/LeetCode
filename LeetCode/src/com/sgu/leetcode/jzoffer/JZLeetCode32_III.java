package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

import java.util.*;

/**
 * @Author T-T强
 * @Date 2022/7/18 9:54
 */
public class JZLeetCode32_III {
    //32 - III. 从上到下打印二叉树 III
    //请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
    //第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
    //    给定二叉树: [3,9,20,null,null,15,7],
    //             3
    //            / \
    //            9  20
    //            /   \
    //           15    7

    //输出：       [
    //            [3],
    //            [20,9],
    //            [15,7]
    //            ]

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i>0 ; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (list.size() % 2 == 1) Collections.reverse(tmp);
            list.add(tmp);
        }
        return list;
    }

}
