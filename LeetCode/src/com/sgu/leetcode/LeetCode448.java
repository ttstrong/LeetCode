package com.sgu.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/7/10 16:05
 */
public class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。
        //请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
        int n=nums.length;
        HashSet set=new HashSet();
        //把原数组放入HashSet中
        for (int s : nums) {
            set.add(s);
        }
        List list=new ArrayList();
        //将
        for (int i = 1; i <= n; i++) {
            if (set.add(i)){
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] nums={ 1,2,3,6,8,7};
        LeetCode448 leetCode448 = new LeetCode448();
        System.out.println(leetCode448.findDisappearedNumbers(nums));

    }
}
