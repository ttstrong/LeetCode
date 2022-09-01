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

    static void bubbleSort(int[] array) {
        int emp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
                //前面的元素 array[j] 后面的元素 array[j+1]
                if (array[j] > array[j+1]){
                    //交换它们
                    emp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = emp;
                }
            }
        }

    }
}
