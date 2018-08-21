package Math;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        if (nums.length < 3) return -1;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;;
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    res = sum;
                }

                if (sum == target) {
                    return res;
                } else if (sum < target) {
                    low ++;
                } else {
                    high --;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        ThreeSumClosest ts = new ThreeSumClosest();
        System.out.println(ts.threeSumClosest(new int[]{0,2,1,-3}, 1));
    }
}
