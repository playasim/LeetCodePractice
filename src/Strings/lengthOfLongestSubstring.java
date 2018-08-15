package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;
        HashMap<Character, Integer> dict = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (dict.containsKey(s.charAt(i)))
                j = Math.max(j, dict.get(s.charAt(i)) + 1);
            dict.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
