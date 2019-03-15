package stack;

public class StackTester {

    public static void main (String[] args) {
        IntegerStack stack = new IntegerStack(5);

        System.out.println("[STACK TEST]");
        System.out.println("size: " + stack.size());
        System.out.println("capacity: " + stack.capacity());

        System.out.println("push: " + stack.push(4));
        System.out.println("push: " + stack.push(3));
        System.out.println("pop: " + stack.pop());
        System.out.println("size: " + stack.size());
        System.out.println("indexOf: " + stack.indexOf(4));
        System.out.println("indexOf: " + stack.indexOf(3));
        System.out.println("push: " + stack.push(2));
        System.out.println("push: " + stack.push(1));
        System.out.println("push: " + stack.push(5));
        System.out.println("push: " + stack.push(6));
        System.out.println("IsEmpty: " + stack.isEmpty());
        System.out.println("IsFull: " + stack.isFull());

        stack.dump();
    }

}
