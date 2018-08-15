package DP;

public class lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int num5 = 0, num10 = 0, num20 = 0;

        for (int cash : bills) {
            if (cash == 5) num5 ++;
            if (cash == 10) {
                num10 ++;
                num5 --;
            }
            if (cash == 20) {
                num20 ++;
                if (num10 > 0) {
                    num10 --;
                    num5 --;
                } else {
                    num5 = num5 -3;
                }
            }
            if (num5 < 0) return false;
        }
        return true;
    }
}
