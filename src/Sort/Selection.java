package Sort;

/*
selection sort method
 */
public class Selection {
    private static SortUtils sortutil = new SortUtils();
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (sortutil.less(a[j], a[min])) {
                    min = j;
                }
            }
            sortutil.exch(a, i, min);
        }
    }
}
