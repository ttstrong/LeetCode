package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/25 10:55
 */
public class JZLeetCode58_I {
    //58-I.翻转单词顺序
    //输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
    // 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
    /**
     * 输入: " hello world! "
     * 输出:"world! hello"
     * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     */
    public String reverseWords(String s) {
//        String[] s1 = s.trim().split(" ");
//        StringBuffer sb=new StringBuffer();
//        for (int i=s1.length-1;i>=0;i--){
//            if (s1[i].equals("")) continue;
//            sb.append(s1[i]+" ");
//        }
//        return sb.toString().trim();
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }

    public static void main(String[] args) {
        String s="aa fvv!";
        JZLeetCode58_I jzLeetCode58_i = new JZLeetCode58_I();
        System.out.println(jzLeetCode58_i.reverseWords(s));
    }

}
