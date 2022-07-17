package com.sgu.leetcode.jzoffer;

import java.awt.font.ImageGraphicAttribute;
import java.util.Arrays;

/**
 * @Author T-T强
 * @Date 2022/7/17 9:51
 */
public class JZLeetCode11 {

    //旋转数组的最小数字

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 给你一个可能存在重复元素值的数组numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。
     * 请返回旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为 1。
     * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
     * 输入：numbers = [3,4,5,1,2]
     * 输出：1
     */
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            //当 nums[m] > nums[j]时：
            // m 一定在 左排序数组 中，即旋转点 x 一定在 [m + 1, j] 区间内，因此执行 i = m + 1；
            if (numbers[m] > numbers[j]) i = m + 1;
            //当 nums[m] < nums[j]时:
            // m 一定在 右排序数组 中，即旋转点 x 一定在[i, m]闭区间内，因此执行 j = m
            else if (numbers[m] < numbers[j]) j = m;
            else {
                int x = i;
                for(int k = i + 1; k < j; k++) {
                    if(numbers[k] < numbers[x]) x = k;
                }
                return numbers[x];
            }
        }
        return numbers[i];
    }
}
