package week5_Priority_Queues;

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
