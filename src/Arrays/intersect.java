package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersect {

    public int[] intersect (int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] > nums2[index2]) {
                index2 ++;
            }

            else if (nums1[index1] < nums2[index2]) {
                index1 ++;
            }

            else {
                resList.add(nums1[index1]);
                index1 ++;
                index2 ++;
            }
        }

        int[] res = new int[resList.size()];

        for (int i = 0; i < resList.size(); i ++) {
            res[i] = resList.get(i);
        }


        return res;
    }
}
