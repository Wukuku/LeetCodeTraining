package com.wyh.array;

/**
 * @Author wu yuhao
 * @Date 2021/12/19
 * @Description 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 */
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0 || nums[i] != nums[i - 1]){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        LeetCode26 leetCode26 = new LeetCode26();
        int[] nums = new int[]{1,2,2,3,4,5};
        leetCode26.removeDuplicates(nums);
    }
}
/*
    1.原地操作的话，可以用一个游标，实时记录有效不重复数字的坐标，用作返回
    循环遍历目标数组，当游标在首位时游标后移（第一个数字必不可能重复），之后如果循环i判断其与i-1的值相等的话，需要
 */
