package queue;

import java.util.EmptyStackException;

public class IntegerQueue {

    private Integer[] array;
    private Integer maximum;
    private Integer front;
    private Integer rear;
    private Integer number;

    public IntegerQueue(Integer maximum) {
        this.array = new Integer[maximum];
        this.maximum = maximum;
        this.front = this.rear = this.number = 0;
    }

    public Integer enque(Integer x) {
        if (number >= maximum) throw new StackOverflowError();
        rear = (rear) % maximum;
        number++;
        return array[rear++] = x;
    }

    public Integer deque() {
        if (number <= 0)  throw new EmptyStackException();
        front = (front) % maximum;
        number--;
        return array[front++];
    }

    public Integer indexOf(Integer x) {
        for (Integer i = 0; i < number; i++) {
            if (x == array[(i + front) % maximum]) return i;
        }
        return -1;
    }

    public Integer size() {
        return number;
    }

    public Integer capacity() {
        return maximum;
    }

    public void clear() {
        front = rear = number = 0;
    }

    public boolean isEmpty() {
        return number <= 0;
    }

    public boolean isFull() {
        return number >= maximum;
    }

    public void dump() {
        for (Integer i = 0; i < number; i++) {
            System.out.print(array[(i + front) % maximum] + " ");
        }
        System.out.println();
    }

}
