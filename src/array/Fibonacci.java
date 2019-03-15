package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(4));

    }

    static List<Integer> Fibonacci = new ArrayList<>(Arrays.asList(0, 1));

    static Integer fibonacci(Integer number) {
        Integer count = Fibonacci.size();
        while ((count - 1) < number) {
            Fibonacci.add(Fibonacci.get(count - 2) + Fibonacci.get(count - 1));
            count++;
        }

        return Fibonacci.get(number);
    }

}