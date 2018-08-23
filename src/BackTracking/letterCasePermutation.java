package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class letterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        if (S.length() == 0) return Arrays.asList("");
        List<String> ans = new ArrayList<>();
        backtracking(S, ans, 0);
        return ans;
    }

    private void backtracking(String s, List<String> ans, int index) {
        if (s.length() == index) {
            ans.add(s);
            return;
        }
        if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            backtracking(s, ans, index + 1);
            return;

        }
        char[] chs = s.toCharArray();
        chs[index] = Character.toUpperCase(chs[index]);
        backtracking(String.valueOf(chs), ans, index + 1);

        chs[index] = Character.toLowerCase(chs[index]);
        backtracking(String.valueOf(chs), ans, index + 1);


    }

    public static void main(String[] args) {
        letterCasePermutation lp = new letterCasePermutation();
        System.out.println(lp.letterCasePermutation("a1b2"));
    }
}
