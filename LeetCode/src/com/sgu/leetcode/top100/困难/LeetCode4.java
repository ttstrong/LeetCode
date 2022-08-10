package com.sgu.leetcode.top100.困难;

/**
 * @Author T-T强
 * @Date 2022/8/10 8:59
 */
public class LeetCode4 {

    //寻找两个正序数组的中位数
    //给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
    //算法的时间复杂度应该为 O(log (m+n)) 。
    //输入：nums1 = [1,3], nums2 = [2]
    //输出：2.00000
    //解释：合并数组 = [1,2,3] ，中位数 2
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];

        //m是数组nums1，n是数组nums2
        if (m == 0) {
            if (n % 2 == 0) {
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
            } else {
                return nums2[n / 2];
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }
        //m是数组nums1的长度，n是数组nums2的长度
        int count = 0, i = 0, j = 0;
        while (count != (m + n)) {
            //nums1为空
            if (i == m) {
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            //nums2为空
            if (j == n) {
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }
            //对数组进行排序
            if (nums1[i] < nums2[j]) {
                nums[count++] = nums1[i++];
            } else {
                nums[count++] = nums2[j++];
            }
        }
        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }
}
