package week4_quickSortTypes;

/**
 * Douplicate Keys
 * https://www.coursera.org/learn/algorithms-part1/lecture/XvjPd/duplicate-keys
 * */
public class DublicateKeys {
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;

        int lt = lo, gt = hi;

        Comparable v = a[lo];
        int i = lo;

        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        }

        sort(a, lo, lt -1);
        sort(a, gt + 1, hi);
    }

    private static void exch(Comparable[] a, int hi, int lo) {
//        do something
    }
}
