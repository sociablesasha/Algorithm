package link.single;

public class List {


    private Node root;
    private Node last;
    private Integer size;


    public List() {
        this.root = null;
        this.last = null;
        this.size = 0;
    }


    private Node getNode(Integer index) {
        if (size < index || 0 > index) throw new IndexOutOfBoundsException();

        Node node = root;
        for (Integer temp = 0; temp < index; temp++) {
            node = node.getNext();
        }

        return node;
    }


    public List add(Object value) {
        if (value == null) throw new NullPointerException();

        if (root == null) {
            root = new Node(value);
            last = root;
        } else {
            last = last.setNext(new Node(value));
        }

        size++;
        return this;
    }


    public void delete(Integer index) {
        if (size < index || 0 > index) throw new IndexOutOfBoundsException();

        if (0 == index) {
            root = root.getNext();
        } else {
            getNode(index - 1).setNext(getNode(index + 1));
        }

        size--;
    }


    public Object get(Integer index) {
        return getNode(index).getValue();
    }


    public Integer size() {
        return size;
    }


}
