package week3;

import java.util.Iterator;

public class StackIterable<Item> implements Iterable<Item> {
    Node first;

    private class Node {
        Item item;
        Node next;
    }


    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
//            not supported
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    
}
