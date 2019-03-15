package array;

import java.util.Random;

public class Max {

    public static void main(String[] args) {
        Integer[] array = new Integer[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }

        System.out.println(max(array));
    }

    static Integer max(Integer[] array) {
        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max < array[i] ? array[i] : max;
        }
        return max;
    }

}
