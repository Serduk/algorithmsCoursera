package week5_mergingTypes;

/**
 * https://www.coursera.org/learn/algorithms-part1/lecture/ARWDq/mergesort
 *
 * How many compares does mergesort—the pure version without any optimizations—make to sort an input array that is already sorted?
 *
 * linearithmic
 * Correct
 * It makes \sim \frac{1}{2} n \log_2 n∼
 * ​	 nlog
 * ​	 n compares, which is the best case for mergesort.
 * We note that the optimized version that checks whether a[mid] \le a[mid+1]a[mid]≤a[mid+1] requires only \sim \log_2 n∼log
 * ​	 n compares.
 * */
public class MergeSort {
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        assert  isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k = lo; k <= hi; k++) {
           aux[k] = a[k];
        }

        int i = lo, j = mid+1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2;

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux,lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
    }

    private static boolean isSorted(Comparable[] a, int b, int c) {
        return true;
    }

    private static boolean less(Comparable a, Comparable b) {
        return true;
    }
}
