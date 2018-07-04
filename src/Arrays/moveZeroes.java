package Arrays;

public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        boolean flagzero = false;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) {
                flagzero = true;
            }
            if (nums[i] != 0 && flagzero) {
                int temp = nums[i];
                nums[i] = 0;
                nums[idx ++] = temp;
                flagzero = false;
            }
        }

    }
}
