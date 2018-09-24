package week4_quickSortTypes;

import java.util.Arrays;

/**
 * System sorts:
 * https://www.coursera.org/learn/algorithms-part1/lecture/QBNZ7/system-sorts
 *
 * Correct
 * The Java API for \verb#Arrays.sort()#Arrays.sort()
 * for reference types requires that it is stable and guarantees
 * n \log nnlogn performance. Neither of these are properties of standard quicksort.
 *
 * Quicksort uses less memory and is faster
 * in practice on typical inputs (and is typically used by
 * \verb#Arrays.sort()#Arrays.sort() when sorting primitive types,
 * where stability is not relevant).
 *
 * */
public class SystemSorts {
    public static void main(String[] args) {
        Arrays.sort(args);
        for (String anA : args) {
            System.out.println(anA);
        }
    }
}
