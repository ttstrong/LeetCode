package com.sgu.leetcode.jzoffer;

/**
 * @Author T-T强
 * @Date 2022/7/20 8:41
 */
public class JZLeetCode63 {
    //同leetcode121
    //假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
    public int maxProfit(int[] prices) {
        //最低价格
//        int min=Integer.MAX_VALUE;
//        int max=0;
//        for (int i = 0; i < prices.length; i++) {
//            //如果这天的价格小于最低价格，则最低价格是今天
//            if (prices[i]<min) min=prices[i];
//            if (prices[i]-min>max) max=prices[i]-min;
//        }
//        return max;


        //动态规划
//        int cost=Integer.MAX_VALUE,profit=0;
//        for (int price : prices) {
//            cost=Math.min(cost, price);
//            profit=Math.max(profit, price-cost);
//        }
//        return profit;

        //暴力法
        int max=0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit=prices[j]-prices[i];
                if (profit>max) max=profit;
            }
        }
        return max;
    }
}
