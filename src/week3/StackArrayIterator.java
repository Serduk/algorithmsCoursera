package week3;

import java.util.Iterator;

/**
 * StackArrayIterator example
 * */
public class StackArrayIterator<Item> implements Iterable<Item>, Comparable<Item> {
    private int n = 0;
    private Item[] s;

    @Override
    public int compareTo(Item o) {
        return 0;
    }


    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = n;

        public boolean hasNext() {
            return i > 0;
        }

        public void remove() {
//            not supported
        }

        public Item next() {
            return s[--i];
        }
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
}
