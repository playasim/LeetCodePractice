package Math;

import java.util.Scanner;

public class HDU1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int res;
            if (n % 2 == 0) {
                res = (n + 1) * (n / 2);
                System.out.println(res + '\n');
                System.out.println();
            } else  {
                res = ((n + 1) / 2 ) * n;
                System.out.println(res + '\n');
            }
        }
    }
}

/*

1
100
 */