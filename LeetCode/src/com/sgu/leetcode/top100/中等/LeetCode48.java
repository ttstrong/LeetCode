package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/24 8:40
 */
public class LeetCode48 {
    //旋转图像
    //给定一个 n×n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
    //你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。
    //请不要使用另一个矩阵来旋转图像。

    /**
     * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * 输出：[[7,4,1],[8,5,2],[9,6,3]]
     */
    public void rotate(int[][] matrix) {
        //先上下交换
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = temp;
            }
        }
        //沿对角线交换
        for (int i = 0; i < (n >> 1); i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
    }
}
