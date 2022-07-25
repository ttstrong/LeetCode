package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/24 17:39
 */
public class JZLeetCode21 {

    //调整数组顺序使奇数位于偶数前面
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。

    //输入：nums = [1,2,3,4]
    //输出：[1,3,2,4]
    //注：[3,1,2,4] 也是正确的答案之一。
    public static int[] exchange(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right){
            if (nums[left] % 2 != 0){
                left++;
            }else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,4,5,5};
        int[] exchange = exchange(nums);
        for (int i = 0; i < exchange.length; i++) {
            System.out.print(exchange[i] + " ");
        }
    }

}
