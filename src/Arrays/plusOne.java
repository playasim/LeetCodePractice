package Arrays;

public class plusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;

        int temp = 0;
        digits[size - 1] += 1;
        for (int i = size - 1; i >= 0; i --) {
            digits[i] += temp;

            if (digits[i] == 10) {
                temp = 1;
                digits[i] = 0;
            } else {
                temp = 0;
            }
        }

        if (digits[0] == 0) {
            int[] res = new int[size + 1];

            res[0] = 1;

            for (int i = 1; i < size + 1; i ++) {
                res[i] = digits[i - 1];
            }

            return res;
        } else {
            return digits;
        }
    }
}
