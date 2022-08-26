package com.sgu.leetcode.top100.中等;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author T-T强
 * @Date 2022/8/26 9:20
 */
public class LeetCode56 {
    // 合并区间
    //以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
    // 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。

    /**
     * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
     * 输出：[[1,6],[8,10],[15,18]]
     * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        //排序，先按左端点进行排序，如果左端点相等，则按右端点进行排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] <= end){//两个区间有重叠
                end = Math.max(end, intervals[i][1]);
            }else{
                //两个区间没有重叠，保存[start,end]，然后更新
                ans.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[] {start, end});
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < res.length; i++){
            res[i] = ans.get(i);
        }
        return res;
    }

}
