package DP;

public class numberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length <= 2) {
            return 0;
        }
        int length = A.length;
        int[] dp = new int [length];
        int count = 1;
        for (int i = 2; i < length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + count;
                count ++;
            } else {
                dp[i] = dp[i - 1];
                count = 1;
            }
        }
        return dp[length - 1];

    }
}
