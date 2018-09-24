package week5_quicckSortTypes;

public class QuickSort {
    private static int partiotion(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;

        while (true) {
//            find item on left to swap
            while (less(a[++i], a[lo])) {
                if (i == hi) break;
            }

//            find item on right to swap
            while (less(a[lo], a[--j])) {
                if (j == lo) break;
            }

//            check if pointer cross
            if (i >= j) break;
//            swap
            exch(a, i, j);
        }

//        swap with partitioning item
        exch(a, lo, j);
//        return index of item now known to be in place
        return j;
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
