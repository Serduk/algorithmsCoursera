package symbolTables;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;

public class Node {
    private Key key;
    private Value value;
    private Node node;

    public Node(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}
