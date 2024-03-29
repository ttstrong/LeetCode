package com.sgu.leetcode.排序.简单;

/**
 * @Author T-T强
 * @Date 2022/8/2 8:53
 */
public class LeetCode88 {
    //合并两个有序数组
    //给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    //请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    //注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
    // 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = m - 1, p2 = n - 1;
//        int tail = m + n - 1;
//        int cur;
//        while (p1 >= 0 || p2 >= 0) {
//            //p1==-1说明nums1已经没有元素
//            if (p1 == -1) {
//                cur = nums2[p2--];
//            } else if (p2 == -1) {
//                cur = nums1[p1--];
//            } else if (nums1[p1] > nums2[p2]) {
//                cur = nums1[p1--];
//            } else {
//                cur = nums2[p2--];
//            }
//            nums1[tail--] = cur;
//        }


        int[] sorted = new int[m + n];
        int p1 = 0, p2 = 0;
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];

            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i < sorted.length; i++) {
            nums1[i] = sorted[i];
        }
    }
}
