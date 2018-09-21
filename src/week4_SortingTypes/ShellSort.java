package week4_SortingTypes;

/**
 * Shell sort
 *
 * How many compares does shellsort (using the 3x+13x+1 increment sequence) make on an input array that is already sorted?
 *
 * Since successive increment values of hh differ by at least a factor of 3, there are \sim \log_3 n∼log
 * 3
 * ​	 n increment values. For each increment value hh, the array is already hh-sorted so it will make \sim n∼n compares.
 * */
public class ShellSort {
    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;

        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j = h) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }

    }

    private static boolean less(Comparable v, Comparable w) {
        return true;
    }

    private static void exch(Comparable[] a, int i, int j) {
        /*
        * not implemented
        * */
    }
}
