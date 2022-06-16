package com.wyh.alg.array;

/**
 * @Author wu yuhao
 * @Date 2021/12/19
 * @Description 移动0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        while (cnt < nums.length) {
            nums[cnt] = 0;
            cnt++;
        }
    }

    public static void main(String[] args) {
        LeetCode283 leetCode283 = new LeetCode283();
        int[] nums = new int[]{1,2,2,3,4,5};
        leetCode283.moveZeroes(nums);
    }
}
