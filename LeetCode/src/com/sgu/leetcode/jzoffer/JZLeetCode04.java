package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/17 15:28
 */
public class JZLeetCode04 {
    // 二维数组中的查找
    //在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    //请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //暴力法
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//        int rows = matrix.length, columns = matrix[0].length;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (matrix[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;

//        int i = matrix.length - 1, j = 0;
//        while(i >= 0 && j < matrix[0].length)
//        {
//            if(matrix[i][j] > target) i--;
//            else if(matrix[i][j] < target) j++;
//            else return true;
//        }
//        return false;

        //进阶版
        //思路：以左下角元素为起始元素，如果tar小于该数，说明这一行没有tar，消去这一行（i--）。如果大于则往右边继续对比（j++）。
        int i = matrix.length-1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
