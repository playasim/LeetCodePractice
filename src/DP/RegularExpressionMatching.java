package DP;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < p.length(); ++i) {
            if (p.charAt(i - 1) == '*')
                dp[0][i] = dp[0][i - 2];
            else
                dp[0][i] = false;
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if (p.charAt(j - 1) == '*') {
                    //Here is 2 condition:
                    //1. 0 occurence;
                    //2. 1 or more occurences;
                    if (dp[i][j - 2])
                        dp[i][j] = dp[i][j - 2];
                    else if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j -  2) == '.')
                        dp[i][j] = dp[i - 1][j];
                } else
                    dp[i][j] = false;
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        RegularExpressionMatching rm = new RegularExpressionMatching();
        String s = "aaa";
        String p = "ab*a*c*a";
        System.out.println(rm.isMatch(s, p));
    }
}
