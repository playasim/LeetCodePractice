package DP;

import java.util.stream.IntStream;

public class findNumberOfLIS {
    public static int findNumberOfLIS(int[] nums) {
        //sequenceNum[i]表示在i位置上当前最大子序列的个数。
        int max = Integer.MIN_VALUE;
        int res = 0;
        if (nums ==null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int[] dp = IntStream.range(0, nums.length).map(i -> 1).toArray();
        int[] sequenceNum = IntStream.range(0, nums.length).map(i -> 1).toArray();
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        sequenceNum[i] = sequenceNum[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        sequenceNum[i] +=sequenceNum[j];
                    }

                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        for (int i = max - 1; i < nums.length; i++) {
            if (dp[i] == max) {
                res += sequenceNum[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,4,7};
        findNumberOfLIS(arr);
    }
}
