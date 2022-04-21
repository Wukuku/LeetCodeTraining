package com.wyh.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author wu yuhao
 * @Date 2022/4/20
 * @Description
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] ans = new int[n - k + 1];
        ans[0] = deque.peekFirst();
        for (int i = k; i < n; i++) {
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.peekLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }
}
