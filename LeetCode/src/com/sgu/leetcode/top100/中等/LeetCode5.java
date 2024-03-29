package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/11 9:30
 */
public class LeetCode5 {
    //给你一个字符串 s，找到 s 中最长的回文子串。
    //输入：s = "babad"
    //输出："bab"
    //解释："aba" 同样是符合题意的答案。

    // 中心扩散法
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);
    }

}
