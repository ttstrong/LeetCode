package com.sgu.leetcode.排序.基础排序算法;

/**
 * @Author T-T强
 * @Date 2022/9/1 16:50
 */
public class Insert01 {
    //直接插入
    public static void main(String[] args) {
        int[] array = {1, 5, 3};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //插入排序，从小到大
    static void insertSort(int[] array) {
        //要插入的数据
        int insertVal = 0;
        //要插入数据的上一个数的下标（无序表最后一个元素的下标）
        int preIndex = 0;

        //获取每个数组下标
        for (int i = 1; i < array.length; i++) {
            //要排序的数，第一个已经排好了
            insertVal = array[i];
            //这个数的上一个数的下标（无序表最后一个元素的下标）
            preIndex = i-1;

            //如果左边的这个元素比当前元素大，当前元素就需要左移，直到左边的数比它小
            while (preIndex >= 0 && array[preIndex] > insertVal) {
                //被比较的元素右移，腾出位置
                array[preIndex+1] =
                        array[preIndex];
                //当前元素左移
                preIndex--;
            }
            //左边的数比当前元素小，当前元素需要插入左边元素下标的后一位
            if (preIndex+1!=i){
                array[preIndex+1] = insertVal;
            }

        }
    }
}
