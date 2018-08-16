package Strings;

public class ZigZagConvertion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] arr= new StringBuilder[numRows];
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < arr.length; i++)
            arr[i] = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            int index = i % ((numRows - 1) * 2);
            index = index < numRows ? index : (numRows - 1) * 2 - index;
            arr[index].append(s.charAt(i));
        }
        for (int i = 0; i < numRows; ++i)
            res = res.append(arr[i]);

        return res.toString();
    }

    public static void main(String[] args) {
        ZigZagConvertion zzc = new ZigZagConvertion();
        System.out.println(zzc.convert("PAYPALISHIRING", 4));
    }
}
