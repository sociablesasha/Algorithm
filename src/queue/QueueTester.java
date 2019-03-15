package queue;

public class QueueTester {

    public static void main (String[] args) {
        IntegerQueue queue = new IntegerQueue(5);

        System.out.println("[STACK TEST]");
        System.out.println("size: " + queue.size());
        System.out.println("capacity: " + queue.capacity());

        System.out.println("enque: " + queue.enque(4));
        System.out.println("enque: " + queue.enque(3));
        System.out.println("deque: " + queue.deque());
        System.out.println("size: " + queue.size());
        System.out.println("indexOf: " + queue.indexOf(4));
        System.out.println("indexOf: " + queue.indexOf(3));
        System.out.println("enque: " + queue.enque(2));
        System.out.println("enque: " + queue.enque(1));
        System.out.println("enque: " + queue.enque(5));
        System.out.println("enque: " + queue.enque(6));
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("IsFull: " + queue.isFull());

        queue.dump();
    }

}
