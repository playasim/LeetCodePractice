package Sort;

public class Insertion {
    private static SortUtils sortUtils = new SortUtils();

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && sortUtils.less(a[j], a[j - 1]); j--) {
                sortUtils.exch(a, j, j - 1);
            }
        }
    }
}
