package codedash.linkedlists;

/**
 * Linked list Node
 */
public class Node {
    private String _value;
    private Node _next;

    public Node(String value) {
        this._value = value;
        this._next = null;
    }

    public String getValue() {
        return _value;
    }

    public String value() {
        return _value;
    }

    public void setValue(String value) {
        this._value = value;
    }

    public Node getNext() {
        return _next;
    }

    public Node next() {
        return _next;
    }

    public void setNext(Node next) {
        this._next = next;
    }
}
