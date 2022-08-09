package com.sgu.leetcode.top100.中等;

import java.util.HashMap;

/**
 * @Author T-T强
 * @Date 2022/8/9 8:44
 */
public class LeetCode3 {
    //无重复字符的最长子串
    //给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
    //输入: s = "abcabcbb"
    //输出: 3
    //解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1); // 返回上一个重复字符的下一个位置
            }
            // 加入新的字符， 遇到重复的字符会更新在map中的value值，即重复字符的最新下标
            map.put(s.charAt(end), end);
            max = Math.max(max, end - start + 1);// 更新最大不重复子串长度
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
