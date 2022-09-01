package com.sgu.leetcode.排序.基础排序算法;

/**
 * @Author T-T强
 * @Date 2022/9/1 19:22
 */
public class binarySearch {
    //二分查找
    public static void main(String[] args) {
        int[] array = {-10, -4, 1, 5, 9, 20, 35};
        int i = binarySearch2(array, 9, 0, array.length - 1);
        if (i == -1) {
            System.out.println("没有这个值");
        } else {
            System.out.println("找到了这个值，对应的下标为：" + i);
        }
    }


    /**
     * 二分查找
     *
     * @param array  有序的数组
     * @param target 目标值
     * @return 目标值的索引，-1为没有这个值
     */
    static int binarySearch2(int[] array, int target, int left, int right) {
        //如果没有找到，递归结束条件
        if (left > right) {
            return -1;
        }
        //中间值
        int mid = (left + right) / 2;
        //中间值小于目标数
        if (array[mid] < target) {
            //值应该在右边，修改左指针
            return binarySearch2(array, target, mid + 1, right);
        } else if (array[mid] > target) {
            //中间值大于目标数
            //值应该在左边，修改右指针
            return binarySearch2(array, target, left, mid - 1);
        } else {
            //找到了
            return mid;
        }
    }
}
