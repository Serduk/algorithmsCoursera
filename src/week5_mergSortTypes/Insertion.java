package week5_mergSortTypes;


public class Insertion {
    public void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    private static boolean less(Object b, Object c) {
//        return a.compare(b, c) < 0;
        return true;
    }

    private static void exch(Object[] a, int j, int b) {
        Object swap = a[j];
        a[j] = b;
        a[b] = swap;
    }
}
