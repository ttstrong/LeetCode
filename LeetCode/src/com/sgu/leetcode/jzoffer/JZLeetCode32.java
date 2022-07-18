package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.sql.ResultSet;
import java.util.*;

/**
 * @Author T-T强
 * @Date 2022/7/18 8:36
 */
public class JZLeetCode32 {
    //32 - I. 从上到下打印二叉树
    //从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
    //输入：[3,9,20,null,null,15,7]
    //              3
    //             / \
    //            9   20
    //           /     \
    //          15      7
    //输出：[3,9,20,15,7]
    //思路：层次遍历
    public int[] levelOrder(TreeNode root) {
        if (root==null) return new  int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);
            if (node.left!=null) queue.add(node.left);
            if (node.right!=null) queue.add(node.right);
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;

    }
}
