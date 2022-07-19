package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.TreeNode;

/**
 * @Author T-T强
 * @Date 2022/7/19 9:36
 */
public class JZLeetCode26 {
//    输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
//    B是A的子结构， 即 A中有出现和B相同的结构和节点值。
//    输入：A = [1,2,3], B = [3,1]
//    输出：false


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //recur(A, B)判断树A包含树B
        //isSubStructure(A.left, B) 树B是树A左子树的子结构
        //isSubStructure(A.right, B) 树B是树A右子树的子结构
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    boolean recur(TreeNode a, TreeNode b) {
        //这里如果b为空，说明B已经访问完了，确定是A的子结构
        if (b == null) return true;
        //如果b不为空a为空，或者这两个节点值不同，说明b树不是a的子结构，直接返回false
        if (a == null || a.val != b.val) return false;
        //当前节点比较完之后还要继续判断左右子节点
        return recur(a.left, b.left) && recur(a.right, b.right);
    }
}
