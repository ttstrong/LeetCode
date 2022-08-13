package com.sgu.leetcode.top100.中等;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author T-T强
 * @Date 2022/8/12 10:43
 */
public class LeetCode17 {
    //电话号码的字母组合
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public static void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer sb) {
        if (index == digits.length()) {
            combinations.add(sb.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                sb.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        String s="34";
        System.out.println(letterCombinations(s));
    }
}
