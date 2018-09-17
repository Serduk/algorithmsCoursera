package week3;

public class FixdCapacityStackOfStrings {
    private String[] s;
    private  int n = 0;

    public FixdCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(String item) {
        s[n++] = item;
    }

    public String pop() {
        return s[--n];
    }
}
