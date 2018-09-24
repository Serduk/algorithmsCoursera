package week5_quickSortTypes;

/**
 * Lection https://www.coursera.org/learn/algorithms-part1/lecture/UQxFT/selection
 * */
public class Selection {
    public static Comparable select(Comparable[] a, int k) {
//        Std.Random.shuffle(a);

        int lo = 0, hi = a.length -1;

        while (hi > lo) {
            int j = partition(a, lo, hi);

            if (j < k) lo = j + 1;
            else if (j > k) lo = j + 1;
            else return a[k];
        }

        return a[k];
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        return 1;
    }
}
