package Math;

import java.util.Scanner;

public class HDU1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (n == 0 && a == 0 && b == 0) System.exit(0);
            if (n <= 2) {
                System.out.println(1);
                continue;
            }
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i] = (a * dp[i - 1] + b * dp[i - 2]) % 7;
            }
            System.out.println(dp[n]);
        }

    }
}
