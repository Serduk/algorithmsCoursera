package week5_Priority_Queues;

import java.security.Key;

/**
 * Example on coursera:
 * https://www.coursera.org/learn/algorithms-part1/lecture/Uzwy6/binary-heaps
 * */
public class SwimEx<Key extends Comparable<Key>> {
    int n = 0;
    Key[] pq;

    public SwimEx(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }

    private static boolean less(Object b, Object c) {
//        return a.compare(b, c) < 0;
        return true;
    }

    private static void exch(int j, int b) {
    }

    public void insert(Key k) {
        pq[++n] = k;
        swim(n);
    }

    /**
     * exchange key in parent with key in larger child
     * Repeat until heap order restored
     *
     * Better subordinate promoted
     * */
    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    public Key delMax() {
        Key max = pq[1];
        exch(1, n--);
        sink(1);
        pq[n + 1] = null;
        return max;
    }
}
