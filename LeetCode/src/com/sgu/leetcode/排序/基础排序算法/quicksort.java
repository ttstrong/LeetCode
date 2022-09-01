package com.sgu.leetcode.排序.基础排序算法;

import java.util.Random;

/**
 * @Author T-T强
 * @Date 2022/9/1 16:58
 */
public class quicksort {
    //快速排序
    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int ensure = randomizedPart(nums, left, right);
        quickSort(nums, left, ensure - 1);
        quickSort(nums, ensure + 1, right);
    }

    private int randomizedPart(int[] nums, int left, int right) {
        // 随机选一个基准点
        int index = new Random().nextInt(right - left + 1) + left;
        // 把这个基准点放在区间的最右侧，方便取
        int tmp = nums[right];
        nums[right] = nums[index];
        nums[index] = tmp;
        return part(nums, left, right);
    }

    private int part(int[] nums, int left, int right) {
        int target = nums[right];
        int base = left, cur = left;
        for (; cur < right; cur++) {
            if (nums[cur] < target) {
                if (base != cur) {
                    int tmp = nums[base];
                    nums[base] = nums[cur];
                    nums[cur] = tmp;
                }
                base++;
            }
        }

        int tmp = nums[base];
        nums[base] = nums[right];
        nums[right] = tmp;
        return base;
    }
}
