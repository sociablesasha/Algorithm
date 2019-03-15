package sort.bubble;

import sort.Data;

public class Bubble {

    public static void main(String[] args) {
        // Default
        Data.print();

        // DESC
        sort(Data.array, "DESC");
        Data.print();

        // ASC
        sort(Data.array, "ASC");
        Data.print();
    }

    static void sort(Integer[] array, String orderBy) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (orderBy.equals("ASC") && array[i] > array[j])
                    swap(array, i, j);
                if (orderBy.equals("DESC") && array[i] < array[j])
                    swap(array, i, j);
            }
        }
    }

    static void swap(Integer[] array, int i, int j) {
        Integer temp = null;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
