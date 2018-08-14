package DP;

public class BackPack {
    static class commodity {
        int value;
        int weight;

        public commodity(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }



    static final int NUMS = 3;
    static final int WEIGHT = 50;



    public static void main(String[] args) {

        commodity[] goods = new commodity[4];
        commodity g1 = new commodity(0, 0);
        commodity g2 = new commodity(60, 10);
        commodity g3 = new commodity(100, 20);
        commodity g4 = new commodity(120, 30);
        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;
        goods[3] = g4;

        //dp[i][w] 表示当背包重量为w时，选择i物品时的价值。
        int[][] dp = new int[NUMS + 1][WEIGHT + 1];
        for (int i = 1; i <= NUMS; i++) {
            dp[i][0] = 0;
            for (int w = 1; w <= WEIGHT; w++) {
                if (goods[i].weight <= w) {
                    if (goods[i].value + dp[i - 1][w - goods[i].weight] > dp[i - 1][w])
                        dp[i][w] = goods[i].value + dp[i - 1][w - goods[i].weight];
                    else
                        dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("value:" + dp[NUMS][WEIGHT]);





    }


}
