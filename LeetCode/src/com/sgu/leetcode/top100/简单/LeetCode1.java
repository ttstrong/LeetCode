package com.sgu.leetcode.top100.简单;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author T-T强
 * @Date 2022/8/7 10:39
 */
public class LeetCode1 {

    //两数之和
    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //你可以按任意顺序返回答案。
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

    public static int[] twoSum(int[] nums, int target) {
        //暴力法
//        int n=nums.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(nums[i]+nums[j]==target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[0];

        //哈希表
        Map<Integer, Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums={5,1,2,4};
        int target=7;
        System.out.println(twoSum(nums, target));
    }

}
