package com.wyh.sort;

/**
 * @Author wu yuhao
 * @Date 2022/5/5
 * @Description
 */
public class quickSortTemplate {
    public void quickSort(int[] nums, int l, int r) {
        if (l == r) return;
        int partition = partition(nums, l, r);
        quickSort(nums, l, partition);
        quickSort(nums, partition + 1, r);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = (int) (Math.random() * (nums.length - 1));
        int pivotal = nums[pivot];

        while (left <= right) {
            while (nums[left] < pivotal) left++;
            while (nums[right] > pivotal) right--;
            if (left == right) break;
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return right;
    }
}
