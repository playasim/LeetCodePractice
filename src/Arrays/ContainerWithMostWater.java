package Arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int high = Math.min(height[left], height[right]);
            max = max > width * high ? max : width * high;
            if (height[left] < height[right])
                left ++;
            else
                right --;
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwm = new ContainerWithMostWater();
        System.out.println(cwm.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
