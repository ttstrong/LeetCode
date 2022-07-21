package com.sgu.leetcode.jzoffer;

import java.util.*;

/**
 * @Author T-T强
 * @Date 2022/7/21 9:48
 */
public class JZLeetCode48 {
    //请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
    //最长不含重复字符的子字符串
    public int lengthOfLongestSubstring(String s) {
        int r = 0, l = 0, res = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
            char c = s.charAt(r++);
            //如果遇到重复的字符，则清空set。
            while (set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, set.size());
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcac";//3
        JZLeetCode48 jzLeetCode48 = new JZLeetCode48();
        System.out.println(jzLeetCode48.lengthOfLongestSubstring(s));
    }
}
