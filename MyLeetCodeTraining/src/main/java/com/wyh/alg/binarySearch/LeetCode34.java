package com.wyh.alg.binarySearch;

/**
 * @Author wu yuhao
 * @Date 2022/5/2
 * @Description 在排序数组中查找元素的第一个和最后一个位置
 * 5 7 7 8 8 9  ---8
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        result[0] = right;
        left = -1;
        right = nums.length;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        result[1] = left;
        if (result[0] > result[1]) {
            return new int[]{-1,-1};
        }
        return result;
    }
}
