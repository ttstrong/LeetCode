package com.sgu.leetcode.top100.中等;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author T-T强
 * @Date 2022/9/1 8:37
 */
public class LeetCode96 {
    /**
     * 不同的二叉搜索树
     * 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？
     * 返回满足题意的二叉搜索树的种数。
     * 输入：n = 3
     * 输出：5
     */
    Map<Integer, Integer> map=new HashMap<>();
    public int numTrees(int n) {
        if (n==0 || n==1){
            return 1;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }
        int count=0;
        for (int i = 1; i < n; i++) {
            //以i为根节点
            //左边有多少种子树
            int left=numTrees(i-1);
            //右边有多少种子树
            int right=numTrees(n-i);
            //左边*右边就是当前节点的子树个数
            count+=left*right;
        }
        map.put(n, count);
        return count;
    }

}
