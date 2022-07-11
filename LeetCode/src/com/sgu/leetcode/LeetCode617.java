package com.sgu.leetcode;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author T-T强
 * @Date 2022/7/11 10:10
 */
public class LeetCode617 {

//    给你两棵二叉树： root1 和 root2 。
//    想象一下，当你将其中一棵覆盖到另一棵之上时，两棵树上的一些节点将会重叠（而另一些不会）。你需要将这两棵树合并成一棵新二叉树。合并的规则是：如果两个节点重叠，那么将这两个节点的值相加作为合并后节点的新值；否则，不为 null 的节点将直接作为新二叉树的节点。
//    返回合并后的二叉树。
//    注意: 合并过程必须从两个树的根节点开始。

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if (t1 == null || t2 == null) {
//            return t1 == null ? t2 : t1;
//        }
//        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
//        q.add(t1);
//        q.add(t2);
//        while (q.size() > 0) {
//            TreeNode r1 = q.remove();
//            TreeNode r2 = q.remove();
//            r1.val = r1.val + r2.val;
//            //如果r1和r2的左子树都不为空，就放到队列中
//            //如果r1的左子树为空，就把r2的左子树挂到r1的左子树上
//            if (r1.left != null && r2.left != null) {
//                q.add(r1.left);
//                q.add(r2.left);
//            } else if (r1.left == null) {
//                r1.left = r2.left;
//            }
//            //对于右子树也是一样的
//            if (r1.right != null && r2.right != null) {
//                q.add(r1.right);
//                q.add(r2.right);
//            } else if (r1.right == null) {
//                r1.right = r2.right;
//            }
//        }
//        return t1;

        if(t1==null && t2==null){
            return null;
        }
        if (t1 !=null && t2 ==null){
            return t1;
        }
        if (t2 !=null && t1 ==null){
            return t2;
        }
        t1.val= t1.val+ t2.val;
        t1.left=mergeTrees(t1.left, t2.left);
        t1.right=mergeTrees(t1.right,t2.right);
        return t1;
    }
}
