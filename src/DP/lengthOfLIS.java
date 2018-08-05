package DP;

import java.util.Arrays;

/*
leetcode 300
 */
public class lengthOfLIS {

    public static int lengthOfLIS(int[] nums) {
        int max = Integer.MIN_VALUE;
        if (nums ==null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
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
        System.out.println(Arrays.toString(dp));
        System.out.println(max);
        return max;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,7,9,4,10,5,6};
        lengthOfLIS(arr);
    }
}
