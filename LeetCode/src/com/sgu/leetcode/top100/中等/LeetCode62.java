package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/26 10:25
 */
public class LeetCode62 {
    /**
     * 不同路径(动态规划)
     * 一个机器人位于一个 m x n网格的左上角 （起始点在下图中标记为 “Start” ）。
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
     * 问总共有多少条不同的路径？
     */
    public int uniquePaths(int m, int n) {
        int[][] x = new int[m][n];
        //设置边界
        for (int i = 0; i < m; i++) {
            x[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            x[0][j] = 1;
        }
        //动态规划
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                x[i][j]=x[i-1][j]+x[i][j-1];
            }
        }
        return x[m-1][n-1];
    }
}
