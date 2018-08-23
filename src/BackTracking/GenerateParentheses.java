package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        backtracking(res, "", 0, 0, n);
        return res;
    }

    private void backtracking(List<String> res,String str, int open, int close, int n) {
        if (str.length() == 2 * n) {
            res.add(str);
            return;
        }
        if (open < n) {
            backtracking(res, str + "(", open + 1, close, n);
        }
        if (close < open) {
            backtracking(res, str + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println(gp.generateParenthesis(3));
    }
}
