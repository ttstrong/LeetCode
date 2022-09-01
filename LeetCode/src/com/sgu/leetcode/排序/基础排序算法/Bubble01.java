package com.sgu.leetcode.排序.基础排序算法;

/**
 * @Author T-T强
 * @Date 2022/9/1 16:33
 */
public class Bubble01 {

    //冒泡排序
    public static void main(String[] args) {
        int[] array = {5, 1, 3};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    static void bubbleSort(int[] arr) {
        int tmp = 0;
        //标志位，如果一次交换都没有，直接退出
        boolean flag = false;
        if (arr.length <= 1) return;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                flag = true;
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            //只要有一组排序内，数组已经有序，就不进行接下来的所有排序。
            if (flag) break;
        }
    }
}
