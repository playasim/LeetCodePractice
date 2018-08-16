package Strings;

public class isPalindrome {
    public boolean isPalindrome(int x) {

        String xArr = String.valueOf(x);
        for (int i = 0, j = xArr.length() - 1; i < xArr.length() / 2; i++, j--) {
            if (xArr.charAt(i) != xArr.charAt(j))
                return false;
        }
        return true;
    }
}
