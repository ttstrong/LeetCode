package com.sgu.leetcode.排序.简单;

/**
 * @Author T-T强
 * @Date 2022/8/3 9:28
 */
public class LeetCode242 {
    //有效的字母异位词
    //给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
    //注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
    //输入: s = "anagram", t = "nagaram"
    //输出: true
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
//        char[] s1 = s.toCharArray();
//        char[] t1 = t.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(t1);
//
//        return Arrays.equals(s1, t1);


        int[] chars=new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i]!=0) return false;
        }
        return true;
    }

}
