package DP;

public class maxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        //dp[i] = Math.max(dp[i - 1],prices[i] - min );
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i ++) {
            dp[i] = Math.max(dp[i - 1],prices[i] - min );
            min = prices[i] > min ? min : prices[i];
        }

        return dp[prices.length - 1];
    }
}
