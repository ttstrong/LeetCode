package com.sgu.leetcode.jzoffer;

import java.util.ArrayList;

/**
 * @Author T-T强
 * @Date 2022/7/14 8:36
 */
public class JZLeetCode05 {
//    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//    输入：s = "We are happy."
//    输出："We%20are%20happy."

    public String replaceSpace(String s) {
        StringBuffer str=new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c==' '){
                str.append("%20");
            }else {
                str.append(c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="we are fa";
        JZLeetCode05 jzLeetCode05 = new JZLeetCode05();
        System.out.println(jzLeetCode05.replaceSpace(s));
    }
}
