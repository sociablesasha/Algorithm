package link.duplex;

public class Node {

    private Object value;
    private Node previous;
    private Node next;

    public Node(Object value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    public Object getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public Node setPrevious(Node node) {
        this.previous = node;
        return this.previous;
    }

    public Node setNext(Node node) {
        this.next = node;
        return this.next;
    }

}
