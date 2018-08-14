package DP;

import java.util.Scanner;

public class BoneCollectorHDU2602 {
    static int nums, weight;
    static int[] values, weights;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int cycle = 0; cycle < loop; cycle++) {
            nums = sc.nextInt();
            weight = sc.nextInt();
            values = new int[nums + 1];
            weights = new int[nums + 1];
            for (int i = 1; i <= nums; i++) values[i] = sc.nextInt();
            for (int i = 1; i <= nums; i++) weights[i] = sc.nextInt();
            dp = new int[nums + 1][weight + 1];
            for (int good = 1; good <= nums; good++) {
                for (int wi = 1; wi <= weight; wi++) {
                    if ( weights[good] <= wi) {
                        dp[good][wi] = Math.max(dp[good - 1][wi], dp[good - 1][wi - weights[good]] + values[good]);
                    } else {
                        dp[good][wi] = dp[good - 1][wi];
                    }
                }
            }
            System.out.println(dp[nums][weight]);
        }
        sc.close();
    }
}
