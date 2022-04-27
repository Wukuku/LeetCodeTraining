package com.wyh.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wu yuhao
 * @Date 2022/4/25
 * @Description 全排列
 */
public class LeetCode46 {
    LinkedList<Integer> list = new LinkedList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        recur(nums, visited);
        return ans;
    }

    void recur(int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            ans.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]){
                continue;
            }
            list.add(nums[i]);
            visited[i] = true;
            recur(nums,visited);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        LeetCode46 leetCode46 = new LeetCode46();
        int[] nums = new int[]{1,2,3};
        leetCode46.permute(nums);

    }
}
