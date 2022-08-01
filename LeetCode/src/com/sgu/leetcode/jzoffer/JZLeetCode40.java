package com.sgu.leetcode.jzoffer;

import java.util.Arrays;

/**
 * @Author T-T强
 * @Date 2022/8/1 8:51
 */
public class JZLeetCode40 {
    //最小的k个数(简单,快排)

    //输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
    public int[] getLeastNumbers(int[] arr, int k) {
        //傻瓜做法
//        int[] newArr=new int[k];
//        Arrays.sort(arr);
//        for (int i = 0; i < k; i++) {
//            newArr[i]=arr[i];
//        }
//        return newArr;

        //快排
            quickSort(arr, 0, arr.length - 1);
            return Arrays.copyOf(arr, k);
        }
        private void quickSort(int[] arr, int l, int r) {
            // 子数组长度为 1 时终止递归
            if (l >= r) return;
            // 哨兵划分操作（以 arr[l] 作为基准数）
            int i = l, j = r;
            while (i < j) {
                while (i < j && arr[j] >= arr[l]) j--;
                while (i < j && arr[i] <= arr[l]) i++;
                swap(arr, i, j);
            }
            swap(arr, i, l);
            // 递归左（右）子数组执行哨兵划分
            quickSort(arr, l, i - 1);
            quickSort(arr, i + 1, r);
        }
        private void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
}
