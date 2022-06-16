package com.wyh.alg.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author wu yuhao
 * @Date 2022/5/5
 * @Description 合并区间
 */
public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        LeetCode56 leetCode56 = new LeetCode56();
        int[][] array = new int[][]{{1,2},{3,4},{7,9}};
        leetCode56.merge(array);
    }
}
