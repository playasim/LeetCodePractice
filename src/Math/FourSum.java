package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int len = nums.length;
        for (int i = 0; i < len - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;;
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int low = j + 1, high = len - 1;
                while (low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low ++;
                        high --;
                    } else if (sum < target) {
                        low ++;
                    } else {
                        high --;
                    }
                }
            }
        }


        return res;
    }

    public static void main(String[] args) {
        FourSum fs = new FourSum();
        System.out.println(fs.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
