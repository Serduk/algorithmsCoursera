package symbolTables;

/**
 * example:
 * https://www.coursera.org/learn/algorithms-part1/lecture/PWZAr/deletion-in-bsts
 * */
public class Node<Key, Value> implements Comparable {
    private Key key;
    private Value value;
    private Node node;
    private Node root;
    private int count;

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

    public Key floor(Key key) {
        Node x = floor(root, key);

        if (x == null) return null;
//        return x.key;
        return null;
    }

    public Node floor(Node node, Key key) {

        if (node == null) return null;

//        int cmp = key.compareTo(key);
        int cmp = 1;

        if (cmp == 0) {
            return node;
        }

        if (cmp < 0) return floor(node.left(), key);

        Node t = floor(node, key);

        if (t != null) return t;
        else return node;
    }

    public int size() {
        return size(root);
    }

    public int size(Node node) {
        if (node == null) return 0;
        else return node.count;
    }

    public void delete(Key key) {
        root = delete(root, key);
    }

    public Node delete(Node node, Key key) {
        if (node == null) return null;

//        int cmp = key.compareTo(key);
        int cmp = 1;

//        if (cmp < 0) node.left() = delete(node.left(), key);
//        else if (cmp > 0) node.right() = delete(node.right(), key);
//        else {
//            if (node.right() == null) return node.left();
//            if (node.left() == null) return node.right();

//            Node t = node;
//            t = min(t.right());
//            t.right() = delete(t.right());
//            node.left() = t.left();
//        }
        node.count = size(node.left()) + size(node.right()) + 1;
        return node;
    }
}
