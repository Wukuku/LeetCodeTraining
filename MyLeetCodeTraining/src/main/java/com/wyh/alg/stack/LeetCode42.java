package com.wyh.alg.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author wu yuhao
 * @Date 2022/4/19
 * @Description
 */
public class LeetCode42 {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int pop = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int width = i - left - 1;
                int curHeight = Math.min(height[i], height[left]) - height[pop];
                ans += width * curHeight;
            }
            stack.push(i);
        }
        return ans;
    }
}
