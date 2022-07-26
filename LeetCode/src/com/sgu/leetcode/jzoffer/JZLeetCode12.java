package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/26 8:56
 */
public class JZLeetCode12 {

    //矩阵中的路径
    //给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
    //单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
    // 同一个单元格内的字母不允许被重复使用。
    //输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    //输出：true
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        // 遍历图
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                // 如果找到了，就返回true。否则继续找
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        // 遍历结束没找到false
        return false;
    }
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        //当前元素在矩阵 board 中的行列索引 i 和 j ，当前目标字符在 word 中的索引 k
        //边界值
        if (i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word[k]) return false;
        //k = len(word) - 1 ，即字符串 word 已全部匹配
        if (k == word.length-1) return true;
        //标记当前矩阵元素： 将 board[i][j] 修改为 空字符 '' ，代表此元素已访问过，防止之后搜索时重复访问。
        board[i][j]='\0';
        // 顺序是 下 上 右 左；上面找到了对应索引的值所以k+1
        boolean res=dfs(board, word, i+1,j,k+1) || dfs(board, word, i-1, j, k+1) ||
                    dfs(board, word, i, j+1, k+1) || dfs(board, word, i, j-1, k+1);
        board[i][j]=word[k];
        return res;
    }
}
