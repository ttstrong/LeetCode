package com.sgu.leetcode.jzoffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author T-T强
 * @Date 2022/7/17 11:31
 */
public class JZLeetCode50 {
    //第一个只出现一次的字符
    //在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
    //输入：s = "abaccdeff"
    //输出：'b'
    public char firstUniqChar(String s) {
       Map<Character, Boolean> map=new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            //!map.containsKey(c)的意思是如果字符串中没有此元素，即第一次添加进map为true，false说明map中有已有该元素。
            map.put(c, !map.containsKey(c));
        }
        //这个遍历是想找出元素中第一个为true的元素。
        for (char c : chars) {
            if (map.get(c)) return c;
        }
        return ' ';
    }

}
