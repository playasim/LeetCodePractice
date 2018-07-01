package Arrays;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mem = new HashMap<>();

        if (nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i ++) {
            if (mem.get(nums[i]) != null) {
                return false;
            } else {
                mem.put(nums[i], i);
            }

        }

        return true;

    }
}
