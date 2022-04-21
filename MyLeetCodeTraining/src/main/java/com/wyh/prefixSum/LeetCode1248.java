package com.wyh.prefixSum;

import com.wyh.hashMap.LeetCode1;

/**
 * @Date 2022/4/21
 * @Description
 */
public class LeetCode1248 {
    /*
    nums =   [1,1,2,1,1], k = 3
    cnt =  [1,1,3,]
    odd = 1 2
    ans = 0,
     */
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        cnt[0] = 0;
        for (int i = 1; i <= n; i++) {
            cnt[i] = cnt[i - 1] + (nums[i - 1] & 1);
        }
        int[] count = new int[n + 1];
        int ans = 0;
        count[cnt[0]]++;
        for(int i = 1; i <= n; i++) {
            if (cnt[i] - k >= 0) {
                ans += count[cnt[i] - k];
            }
                count[cnt[i]]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,1,2,1,1};
        LeetCode1248 leetCode1248 = new LeetCode1248();
        leetCode1248.numberOfSubarrays(test,3);

    }
}
