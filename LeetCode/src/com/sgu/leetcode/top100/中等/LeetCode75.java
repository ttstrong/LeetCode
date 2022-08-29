package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/29 8:41
 */
public class LeetCode75 {
    //颜色分类
    /**
     * 给定一个包含红色、白色和蓝色、共n 个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
     * 必须在不使用库的sort函数的情况下解决这个问题。
     * 输入：nums = [2,0,2,1,1,0]
     * 输出：[0,0,1,1,2,2]
     */
    public void sortColors(int[] nums) {
        int index=0;	//指定位置的索引值
        int tmp = 0;
        for (int i = 1; i < nums.length; i++) {
            index = 0;									//将获得的上一轮最大值的索引后归零
            for (int j = 1; j <= nums.length - i; j++) {
                if (nums[j] > nums[index]) {
                    index = j;
                }
            }
            tmp = nums[nums.length - i];
            nums[nums.length - i] = nums[index];
            nums[index] = tmp;
        }
    }
}
