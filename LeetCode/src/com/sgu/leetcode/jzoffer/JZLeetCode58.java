package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/14 10:11
 */
public class JZLeetCode58 {
    //字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
    // 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
    //思路
    //截取n-1之前的字符，存入StringBuffer中，然后拼接到剩下的字符串后面。

    public String reverseLeftWords(String s, int n) {
        if (s==null){
            return null;
        }
        int length = s.length();
        String str=s.substring(0, n);
        String str1=s.substring(n,length);
        String strSum=str1+str;
        return strSum;
    }

    public static void main(String[] args) {
        int n=3;
        String str="abcdedfg";
        JZLeetCode58 jzLeetCode58 = new JZLeetCode58();
        System.out.println("操作前："+str);
        System.out.println("操作后："+jzLeetCode58.reverseLeftWords(str, n));

    }

}
