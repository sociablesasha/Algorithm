package array;

public class Linear {

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 2, 3, 4, 6 ,9};
        Integer[] arrayBySentence = {1, 5, 7, 2, 3, 4, 6 ,9, null};

        System.out.println(search(array, 5));
        System.out.println(searchBySentence(arrayBySentence, 5));
    }

    static Integer search(Integer[] array, Integer number) {
        for (Integer i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }

        return -1;
    }

    static Integer searchBySentence(Integer[] array, Integer number) {
        array[array.length - 1] = number;

        Integer i = 0;
        while (true) {
            if (array[i] == number) break;
            i++;
        }

        return i == array.length ? -1 : i;
    }

}
