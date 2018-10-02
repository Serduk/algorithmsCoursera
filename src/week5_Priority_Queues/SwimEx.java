package week5_Priority_Queues;

/**
 * Example on coursera:
 * https://www.coursera.org/learn/algorithms-part1/lecture/Uzwy6/binary-heaps
 * */
public class SwimEx {
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
}
