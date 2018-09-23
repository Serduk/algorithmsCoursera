package week5_mergSortTypes;

import java.util.Comparator;

public class ComparatorsSort {
    public static void sort(Object[] a, Comparator comparator) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(comparator, a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    private static boolean less(Comparator a, Object b, Object c) {
        return a.compare(b, c) < 0;
    }

    private static void exch(Object[] a, int j, int b) {
        Object swap = a[j];
        a[j] = b;
        a[b] = swap;
    }

    public class Students {
        public final Comparator<Students> BY_NAME = new ByName();
        public final Comparator<Students> BY_SECTION = new BySelection();

        private final String name = "";
        private final int section = 1;

        private class ByName implements Comparator<Students> {
            public int compare(Students a, Students b) {
                return a.name.compareTo(b.name);
            }
        }

        private class BySelection implements Comparator<Students> {
            public int compare(Students a, Students b) {
                return a.section - b.section;
            }
        }
    }
}
