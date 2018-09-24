package week5_Priority_Queues;

/**
 * https://www.coursera.org/learn/algorithms-part1/lecture/A3kA3/apis-and-elementary-implementations
 *
 * What is the expected number of array accesses and compares, respectively,
 * to insert a random key into an ordered-array implementation of a priority queue?
 *
 *
 * linear and logarithmic
 *
 * Correct
 * We can use binary search to find the insertion point using a logarithmic number of compares.
 * On average, the key to be inserted must be placed in the middle of the array—to keep the array in order,
 * we must shift over all larger keys.
 *
 * */
public class UnorderedMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n;

    public UnorderedMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return  n == 0;
    }

    public void insert(Key x) {
        pq[n++] = x;
    }

    public Key delMax() {
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (less(max, i)) max = i;
        }
        exch(max, n - 1);
        return pq[--n];
    }

    private static boolean less(Object b, Object c) {
//        return a.compare(b, c) < 0;
        return true;
    }

    private static void exch(int j, int b) {
    }
}
