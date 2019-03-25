package sort.selection;

import sort.Data;

public class Selection {

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
        Integer select;
        for (int i = 0; i < array.length - 1; i++) {
            select = i;
            for (int j = i + 1; j < array.length; j++) {
                if (orderBy.equals("ASC") && array[select] > array[j])
                    select = j;
                if (orderBy.equals("DESC") && array[select] < array[j])
                    select = j;
            }
            swap(array, i, select);
        }
    }

    static void swap(Integer[] array, int i, int j) {
        Integer temp = null;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
