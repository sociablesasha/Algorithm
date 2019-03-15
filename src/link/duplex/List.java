package link.duplex;

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

        Node node;
        if (size / 2 > index ) {
            node = root;
            for (Integer temp = 0; temp < index; temp++) {
                node = node.getNext();
            }
        } else {
            node = last;
            for (Integer temp = size - 1; temp > index; temp--) {
                node = node.getPrevious();
            }
        }

        return node;
    }


    public List add(Object value) {
        if (value == null) throw new NullPointerException();

        if (root == null) {
            root = new Node(value);
            last = root;
        } else {
            Node node = new Node(value);
            last = node.setPrevious(last).setNext(node);
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
