package week3;

public class FixedCapacityStackOfItems<Item> {
        private Item[] s;
        private  int n = 0;

        public FixedCapacityStackOfItems(int capacity) {
            s = (Item[]) new Object[capacity];
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public void push(Item item) {
            s[n++] = item;
        }

        public Item pop() {
            Item item = s[--n];
            s[n] = null;

            return item;
        }


}
