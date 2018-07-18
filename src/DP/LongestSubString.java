package DP;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
    public List<String> longestSubStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        List<String> res = null;
        int max = 0;
        int[][] dp = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i == 0 || j == 0) dp[i][j] = 1;
                    else dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        res = new ArrayList<>();
                        res.add(s1.substring(i + 1 - max, i + 1));
                    } else if (dp[i][j] == max){
                        res.add(s1.substring(i + 1 - max, i + 1));
                    }
                }
            }
        }
        return res;
    }
}
