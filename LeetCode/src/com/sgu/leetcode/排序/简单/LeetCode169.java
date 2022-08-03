package com.sgu.leetcode.排序.简单;


/**
 * @Author T-T强
 * @Date 2022/7/5 14:47
 */
public class LeetCode169 {


    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];


        int n = nums.length;
        //声明数组第一个元素为多数元素
        int majority = nums[0];
        //声明当前多数元素个数为1
        int count = 1;
        //遍历数组
        for (int i = 1; i < n; i++) {
            //说明当前元素不是多数元素了
            if (count == 0) {
                //将当前值赋值给多数元素
                majority = nums[i];
            }
            //如果当前元素等于多数元素
            if (nums[i] == majority) {
                count++;
            } else {
                //不相等
                count--;
            }
        }
        return majority;
    }


    public static void main(String[] args) {
        //[6,5,5]
        int[] nums = {6, 5, 5};
        LeetCode169 leetCode169 = new LeetCode169();
        System.out.println(leetCode169.majorityElement(nums));
    }
}
