package com.sgu.leetcode.排序.基础排序算法;

/**
 * @Author T-T强
 * @Date 2022/9/1 16:42
 */
public class SelectionSort {

    //选择排序
    public static void SelectionSort(int[] arr){
        int tmp = 0;

        //每次循环确定一个最小值
        for (int i = 0; i < arr.length; i++) {
            //区间内最小数的下标
            int index = i;
            //找出从当前下标到末尾的最小值
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) index = j;
            }
            //将最小数与前面的数交换
            if (index != i){
                tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }
}
