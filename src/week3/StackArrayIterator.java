package week3;

import java.util.Iterator;

public class StackArrayIterator<Item> implements Iterable<Item> {
    private int n = 0;
    private Item[] s;



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
