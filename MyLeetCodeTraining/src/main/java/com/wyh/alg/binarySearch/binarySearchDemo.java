package com.wyh.alg.binarySearch;

/**
 * @Author wu yuhao
 * @Date 2022/5/2
 * @Description
 */
public class binarySearchDemo {
    //普通二分模板
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length;
        while(left < right) {
            int mid = left + (right - left) >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        binarySearchDemo binarySearchDemo = new binarySearchDemo();
        binarySearchDemo.binarySearch(nums, 13);

    }
}
