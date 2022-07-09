package com.sgu.leetcode;

import java.security.PublicKey;

/**
 * @Author T-T强
 * @Date 2022/7/9 10:17
 */
public class LeetCode283 {
    //    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    //    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    //    输入: nums = [0,1,0,3,12]
    //    输出: [1,3,12,0,0]

    public void moveZeroes(int[] nums) {
//        int n=nums.length,left=0,right=0;
//        while (right<n){
//            if (nums[right]!=0){
//                swap(nums, left, right);
//                left++;
//            }
//            right++;
//        }
//    public void swap(int[] nums,int left,int right){
//        int temp=nums[left];
//        nums[left]=nums[right];
//        nums[right]=temp;
//    }
        //快排的思想，设立一个基准点，为0的放这个基准点的右边，不为0则放左边
        //基准点为0
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素不为0
            if (nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr={0,0,1,2,3};
        LeetCode283 leetCode283 = new LeetCode283();
        leetCode283.moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}
