package com.wyh.alg.doublePointer;

/**
 * @Date 2022/4/22
 * @Description
 * two sum变体，有序数组——双指针夹逼
 */

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[0];

    }
}
