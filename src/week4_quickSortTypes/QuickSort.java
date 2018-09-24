package week4_quickSortTypes;

public class QuickSort {
    private static int partition(Comparable[] a, int lo, int hi) {
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

    private static void sort(Comparable[] a) {
//        Shufle needed for performance guarantee (stay turned)
//        random.shuffle(a)
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;

//        improve running time to 10%
        int m = medianOf3(a, lo, lo + (hi - lo) / 2, hi);
        swap(a, lo, m);

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int medianOf3(Comparable[] a, int lo, int medium, int hi) {
        return medium;
    }

    private static void swap(Comparable[] a, int lo, int m) {
//        SWAP;
    }
}
