package Arrays;
/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.



Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        int len = nums1.length + nums2.length;
        int start = 0;
        int end = nums1.length;
        int cutx = 0;
        int cuty = 0;
        double res = 0.0d;
        while ( start <= end) {
            cutx = (start + end) / 2;
            cuty = (nums1.length + nums2.length + 1) / 2 - cutx;
            int leftX = cutx > 0 ? nums1[cutx - 1] : Integer.MIN_VALUE;
            int rightX = cutx < nums1.length ? nums1[cutx] : Integer.MAX_VALUE;
            int leftY = cuty > 0 ? nums2[cuty - 1] : Integer.MIN_VALUE;
            int rightY = cuty < nums2.length ? nums2[cuty] : Integer.MAX_VALUE;

            if (leftX <= rightY && leftY <= rightX) {
                if (len % 2 == 0)
                    res = (double) (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2;
                else
                    res = (double) Math.max(leftX, leftY);

                break;
            } else if (leftX > rightY) {
                end = cutx - 1;
            } else
                start = cutx + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        findMedianSortedArrays mm = new findMedianSortedArrays();
        int[] l1 = {1,3};
        int[] l2 = {2};
        System.out.println(mm.findMedianSortedArrays(l1, l2));
    }
}
