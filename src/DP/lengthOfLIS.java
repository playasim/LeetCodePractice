package DP;

/*
leetcode 300
 */
public class lengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = nums[j];
                if (j == i) dp[i][j] = 1;
                else if (nums[j] > temp) {
                    dp[i][j] = dp[i][j - 1] + 1;
                    temp = nums[j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
            res = dp[i][nums.length - 1] > res ? dp[i][nums.length - 1] : res;
        }
        return res;

    }
}
