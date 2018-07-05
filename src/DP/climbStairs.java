package DP;

public class climbStairs {
    /*
    dp[i] 代表第i个台阶有多少方法到达
     */
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        //dp[i] = Math.max(dp[i - 1] + 1, dp[i - 2] + 1);

        for (int i = 2; i <= n; i ++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
