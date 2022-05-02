package com.wyh.binarySearch;

/**
 * @Author wu yuhao
 * @Date 2022/5/2
 * @Description 平方根
 */
public class LeetCode69 {
    public int mySqrt(int x) {
        int left = 0, right = x;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (mid <= x / mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}