package Sort;

public class QuickSort {
    private static SortUtils sortUtils = new SortUtils();
    public static int divide(int[] a, int start, int end) {
        Comparable base = a[end];
        while (sortUtils.less(start, end)) {
            while (sortUtils.less(start, end) && sortUtils.less(a[start], base)) {
                start ++;
            }
            if (sortUtils.less(start, end)) {
                sortUtils.exch(a, start, end);
                end --;
            }
            while (sortUtils.less(start, end) && !sortUtils.less(a[end], base)) {
                    end --;
            }
            if (sortUtils.less(start, end)) {
                sortUtils.exch(a, start, end);
                start ++;
            }
        }
        return end;
    }

    public static void sort(int[] a, int start, int end) {
        if (sortUtils.less(end, start)) return;

        int partition = divide(a, start, end);
        sort(a, start, partition - 1);
        sort(a, partition + 1, end);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,7,4,5,8,1,3,9,10};
        System.out.println("Before:");
        sortUtils.show(a);
        System.out.println("After:");
        sort(a, 0, a.length - 1);
        sortUtils.show(a);

    }
}
