package link.single;

public class Node {

    private Object value;
    private Node next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node node) {
        this.next = node;
        return this.next;
    }

    public boolean isLast() {
        return next == null;
    }

}
