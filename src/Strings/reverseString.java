package Strings;

public class reverseString {
    public String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        return stringBuilder.reverse().toString();
    }
}
