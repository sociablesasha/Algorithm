package stack;

import java.util.EmptyStackException;

public class IntegerStack {

    private Integer[] array;
    private Integer maximum;
    private Integer pointer;

    public IntegerStack(Integer maximum) {

        this.array = new Integer[maximum];
        this.maximum = maximum;
        this.pointer = 0;
    }

    public Integer push(Integer x) {
        if (pointer >= maximum) throw new StackOverflowError();
        return array[pointer++] = x;
    }

    public Integer pop() {
        if (pointer <= 0) throw new EmptyStackException();
        return array[--pointer];
    }

    public Integer indexOf(Integer x) {
        for (Integer i = 0; i < pointer; i++) {
            if (x == array[i]) return i;
        }
        return -1;
    }

    public Integer size() {
        return pointer;
    }

    public Integer capacity() {
        return maximum;
    }

    public void clear() {
        pointer = 0;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= maximum;
    }

    public void dump() {
        for (Integer i = 0; i < pointer; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
