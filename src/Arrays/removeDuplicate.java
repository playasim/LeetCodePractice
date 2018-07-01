package Arrays;

public class removeDuplicate {
    public int removeDuplicates(int[] nums) {
        //if nums[i] != nums[index], then put number on nums[++index]
        //rebuild the whole array
        if  (nums.length == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != nums[result]) {
                nums[result + 1] = nums[i];
                result ++;
            }
        }

        return result + 1;

    }
}
