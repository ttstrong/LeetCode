package com.sgu.leetcode;

/**
 * @Author T-T强
 * @Date 2022/7/7 8:40
 */
public class LeetCode121 {
    //    给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
    //    你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
    //    返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0

    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }
            if (prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode121 leetCode121 = new LeetCode121();
        int[] pro= {1, 5, 7, 69};
        int i = leetCode121.maxProfit(pro);
        System.out.println(i);
    }
}
