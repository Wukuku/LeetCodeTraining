package com.wyh.alg.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wu yuhao
 * @Date 2022/4/21
 * @Description
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
