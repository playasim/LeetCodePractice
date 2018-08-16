package Strings;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        for (int index = 0; index < strs[0].length(); index++) {
            for (String str : strs) {
                    if (index == str.length() ||str.charAt(index) != strs[0].charAt(index)) {
                        return strs[0].substring(0, index);
                    }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        longestCommonPrefix lc = new longestCommonPrefix();

        System.out.println(lc.longestCommonPrefix(new String[]{"aa", "a"}));
    }
}
