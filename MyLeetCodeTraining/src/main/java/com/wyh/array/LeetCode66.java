package com.wyh.array;

/**
 * @Author wu yuhao
 * @Date 2022/4/18
 * @Description 加一
 */
public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] result = new int[length + 1];
        result[0] = 1;
        return result;
    }
}
