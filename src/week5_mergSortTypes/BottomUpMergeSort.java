package week5_mergSortTypes;

public class BottomUpMergeSort {
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        assert  isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

//        for (int k = lo; k <= hi; k++) {
//            aux[k] = a[k];
//        }
//
//        int i = lo, j = mid+1;
//
//        for (int k = lo; k <= hi; k++) {
//            if (i > mid) {
//                a[k] = aux[j++];
//            } else if (j > hi) {
//                a[k] = aux[i++];
//            } else if (less(aux[j], aux[i])) {
//                a[k] = aux[j++];
//            } else {
//                a[k] = aux[i++];
//            }
//        }
    }

    private static void sort(Comparable[] a) {
        int n = a.length;

        Comparable[] aux = new Comparable[n];

        for (int sz = 1; sz < n; sz = sz + sz) {
            for (int lo = 0; lo < n - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz, n - 1));
            }
        }

    }

    private static boolean isSorted(Comparable[] a, int b, int c) {
        return true;
    }

    private static boolean less(Comparable a, Comparable b) {
        return true;
    }
}
