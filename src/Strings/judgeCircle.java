package Strings;

public class judgeCircle {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;


        char[] chars = moves.toCharArray();
        for (char chs : chars) {
            if (chs == 'U') {
                up ++;
            }
            if (chs == 'D') {
                down ++;
            }

            if (chs == 'L') {
                left ++;
            }

            if (chs == 'R') {
                right ++;
            }
        }

        if (up == down && left == right) {
            return true;
        } else {
            return  false;
        }

    }
}
