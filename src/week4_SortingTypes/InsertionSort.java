package week4_SortingTypes;

/**
 *
 * https://www.coursera.org/learn/algorithms-part1/lecture/1hYlN/insertion-sort
 *
 * How many compares does insertion sort make on an input array that is already sorted?
 * answer: Linear
 * Each item (except the first) is compared against the item to its left (and to no other items),
 * for a total of n-1n−1 compares.
 *
 * */
public class InsertionSort {
    public static void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j-1])) {
                    exch(a, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return true;
    }

    private static void exch(Comparable[] a, int i, int j) {
        /*
        * not implemented yet
        * */
    }
}
