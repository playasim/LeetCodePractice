package Math;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HDU1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            HashMap<String, Integer> map = new HashMap<>();
            int loop = sc.nextInt();
            if (loop == 0) {
                System.exit(0);
            }
            for (int i = 0; i < loop; i++) {
                String ballon = sc.next();
                if (map.containsKey(ballon)) {
                    int num = map.get(ballon);
                    map.put(ballon, num + 1);
                }
                else
                    map.put(ballon, 1);
            }
            String maxBallon = "";
            int max = 0;
            for (Map.Entry entry : map.entrySet()) {
                int entryValue = (int) entry.getValue();
                if (max < entryValue) {
                    max = entryValue;
                    maxBallon = entry.getKey().toString();
                }
            }
            System.out.println(maxBallon);

        }
    }
}
