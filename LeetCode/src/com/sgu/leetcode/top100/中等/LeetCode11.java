package com.sgu.leetcode.top100.中等;

/**
 * @Author T-T强
 * @Date 2022/8/12 9:45
 */
public class LeetCode11 {
    //盛最多水的容器
    //给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
    //找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
    //返回容器可以储存的最大水量。
    //输入：[1 ,  8,  6,  2,  5,  4,  8,  3,  7]
    //      h0  h1   h2  h3  h4  h5  h6  h7  h8
    //      (h8-h1)*min(h8,h1)
    //输出：49
    //解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
    public static int maxArea(int[] height) {
        int maxCap = 0;//最大容量
        //双指针
        int left = 0, right = height.length - 1;
        int v=0;
        while (left < right) {
            if (height[left] < height[right]) {
                v = height[left] * (right - left);
                left++;
            } else {
                v = height[right] * (right - left);
                right--;
            }
            maxCap=Math.max(maxCap, v);
        }
        return maxCap;
    }

    public static void main(String[] args) {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(h));
    }
}
