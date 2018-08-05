package DP;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
leetcode 300
 */
public class lengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        int max = Integer.MIN_VALUE;
        if (nums ==null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int[] dp = IntStream.range(0, nums.length).map(i -> 1).toArray();
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;

    }

}
