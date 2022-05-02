package com.wyh.binarySearch;

/**
 * @Author wu yuhao
 * @Date 2022/5/2
 * @Description 寻找旋转排序数组中的最小值
 */
public class LeetCode153 {
    public int findMin(int[] nums) {
// [7 1 1 3 4 5]
//  0 1 1 1 1 1
//  l         r
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) >> 1;
            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
