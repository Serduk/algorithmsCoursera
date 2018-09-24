package week5_quickSortTypes;

import java.util.Arrays;

/**
 * System sorts:
 * https://www.coursera.org/learn/algorithms-part1/lecture/QBNZ7/system-sorts
 * */
public class SystemSorts {
    public static void main(String[] args) {
        String[] a = args;

        int n = a.length;

        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
