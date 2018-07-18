package DP;

import java.util.Stack;

public class LongestSubSequence {
    public char[] longestSubSequence(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int max = Integer.MIN_VALUE;
        Stack<Character> res = null;

        int[][] dp = new int[len1+1][len2+1];
        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }

            }
        }


        int m = len1;
        int n = len2;
        while (m > 0 || n > 0) {
            if (dp[m][n] > Math.max(dp[m-1][n], dp[m][n-1])) {
                res.push(s1.charAt(m));
                m --;
                n --;
            } else {
                m --;
            }
        }
        char[] charArray = new char[res.size()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = res.pop();
        }
        return charArray;
    }
}
