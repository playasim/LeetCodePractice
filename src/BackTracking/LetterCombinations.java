package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        List<String> dict = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");

        backtracking(digits, res, "", 0, dict);
        return res;

    }

    private void backtracking(String digits, List<String> res, String str, int index, List<String> dict) {
        if (index == digits.length()) {
            res.add(str);
            return;
        }
        int digit = Integer.valueOf(Character.toString(digits.charAt(index)));
        String charDict = dict.get(digit);
        for (int i = 0; i < charDict.length(); i++) {
            Character c = charDict.charAt(i);

            backtracking(digits, res, str + c.toString(), index + 1, dict);
        }
    }

    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        System.out.println(lc.letterCombinations("23"));
    }
}
