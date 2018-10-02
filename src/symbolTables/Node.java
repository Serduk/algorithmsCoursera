package symbolTables;

public class Node<Key, Value> extends Comparable<>{
    private Key key;
    private Value value;
    private Node node;
    private Node root;

    public Node(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Value getValue(Key key) {
        Node x = node;

        while (x != null) {
            int cmp = node.compareTo(x.key);

            if (cmp < 0) x = x.left();
            else if (cmp > 0) x = x.right();
            else if (cmp == 0) return value;
        }
        return null;
    }

    public void put(Key key, Value value) {
        root.put(key, value);
    }

    public Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value);

//        int cmp = key.compareTo(x.key);
        int cmp = 1;

        if (cmp < 0) {
//            x.left() = put(x.left(), key, value);
        } else if (cmp > 0) {
//            x.right() = put(x.right(), key, value);
        } else if (cmp == 0){
            x.value = value;
        }

        return x;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    private Node left() {
     return node;
    }

    private Node right() {
        return node;
    }
}
