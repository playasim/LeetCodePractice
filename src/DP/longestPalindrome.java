package DP;
/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba"也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
 */

/*
babad

 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        //dp[i][j]代表从index i到j的字串是否为回文1/0;
        int[][] dp = new int[s.length()][s.length()];
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                if (i == 0) {
                    dp[j - i][j] = 1;
                }
                else if (i == 1) {
                    dp[j - i][j] = str[j - i] == str[j] ? 1 : 0;
                } else {
                    dp[j - i][j] = dp[j - i + 1][j - 1] == 1 && str[j - i] == str[j] ? 1 : 0;
                }

                if (dp[j - i][j] == 1) {
                    res = res.length() > i + 1 ? res : s.substring(j - i, j + 1);
                }
            }
        }
        return res;
    }


}
