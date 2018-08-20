package DP;

import java.util.Scanner;

public class HDU1003 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int loop = sc.nextInt();

        for (int i = 0; i < loop; i++) {
            int len = sc.nextInt();
            int[] dp = new int[len];
            int start = 1;
            int end = 1;
            int first = 1;
            int last = 1;
            dp[0] = sc.nextInt();
            int max = dp[0];
            for (int j = 1; j < len; j++) {
                int element = sc.nextInt();
                if (dp[j - 1] + element >= element) {
                    dp[j] = dp[j - 1] + element;
                    end ++;
                } else {
                    dp[j] = element;
                    start = j;
                    end = j;
                }
                if (max < dp[j]) {
                    max = dp[j];
                    first = start;
                    last = end;
                }

            }
            System.out.println("Case " + (i + 1) + ":");
            System.out.println(max + " " + (first) + " " + (last));
            if (i != (loop - 1))
                System.out.println();

        }
    }
}
