package com.wyh.array;

/**
 * @Author wu yuhao
 * @Date 2022/1/3
 * @Description
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * 倒着合并，否则会造成覆盖。
 */
public class LeetCode88 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            for (int k = m + n - 1; k >= 0; k--) {
                if (j < 0 ||(i >= 0 && nums1[i] >= nums2[j])) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
            }
        }

    public static void main(String[] args) {
        LeetCode88 leetCode88 = new LeetCode88();
        leetCode88.merge(new int[] {1,2,3,4,0,0,0},4,new int[] {2,3,3},3);
    }
}
