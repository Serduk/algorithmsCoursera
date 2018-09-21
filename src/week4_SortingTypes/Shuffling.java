package week4_SortingTypes;

import java.util.Random;


/**
 * Shuffle
 *
 * get sort array
 * generate random int for each item in array
 * sort by int
 *
 * */
public class Shuffling {
    public static void shuffle(Object[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {

            Random random = new Random();

            int r = (int) random.nextInt(i + 1);
            exch(a, i, r);
        }
    }

    private static void exch(Object[] o, int a, int b) {
        /*
         * do something
         * */
    }
}
