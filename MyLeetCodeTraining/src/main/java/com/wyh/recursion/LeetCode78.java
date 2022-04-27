package com.wyh.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2022/4/22
 * @Description 子集
 */
public class LeetCode78 {
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        recur(nums, 0);
        return ans;
    }

    void recur(int[] nums, int cur) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        t.add(nums[cur]);
        recur(nums, cur + 1);
        t.remove(t.size() - 1);
        recur(nums, cur + 1);
    }

    public static void main(String[] args) {
        LeetCode78 leetCode78 = new LeetCode78();
        int[] nums = new int[]{1,2,3};
        leetCode78.subsets(nums);
    }
}
