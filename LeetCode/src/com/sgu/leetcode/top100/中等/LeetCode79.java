package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/30 9:41
 */
public class LeetCode79 {
    /**
     * 单词搜索
     * 给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
     * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用
     * 输入：board = [["A","B","C","E"],
     * ["S","F","C","S"],
     * ["A","D","E","E"]], word = "ABCCED"
     * 输出：true
     */

    boolean flag=false;
    public boolean exist(char[][] board, String word) {
        int[][] visited =new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,word,0,visited);
            }
        }

        return flag;
    }
    public void dfs(char[][] board,int col,int row,String word,int wordIndex,int[][] visited){
        if(wordIndex>=word.length()){
            flag=true;
            return ;
        }
        if(col<0||col>=board.length||row<0||row>=board[0].length||board[col][row]!=word.charAt(wordIndex)){
            return ;
        }

        if(visited[col][row]!=1&&board[col][row]==word.charAt(wordIndex)){
            visited[col][row]=1;
            dfs(board,col+1,row,word,wordIndex+1,visited);
            dfs(board,col-1,row,word,wordIndex+1,visited);
            dfs(board,col,row+1,word,wordIndex+1,visited);
            dfs(board,col,row-1,word,wordIndex+1,visited);
            visited[col][row]=0;
        }
    }
}
