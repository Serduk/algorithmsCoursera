package week4_SortingTypes;

/**
 * compares does selection sort make when the input array is already sorted?
 * It will be quadratic
 * */
public class SelectionSort {
    public static void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }

                exch (a, i, min);
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
