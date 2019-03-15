package array;

import java.util.Arrays;

public class Binary {

    public static void main (String[] args) {
        Integer[] array = {1, 5, 7, 2, 3, 4, 6 ,9};

        Arrays.sort(array);

        System.out.println(search(array, 9));
    }

    static Integer search (Integer[] array, Integer number) {
        Integer pl = 0;
        Integer pr = array.length;
        Integer pc;

        do {
            pc = (pl + pr) / 2;

            if (array[pc] == number) return pc;

            else if (array[pc] < number)
                pl = pc + 1;

            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }

}
