package Arrays;

import java.util.HashMap;
import java.util.Map;

public class twoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        if (nums == null || nums.length < 2) {
            return new int[]{};
        }

        int[] res = new int[2];
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(map.get(target - nums[i]))) {
                res[0] = map.get(target - nums[i]);

                res[1] = i;

                break;
            }

            map.put(nums[i], i);
        }

        return res;

    }
}
