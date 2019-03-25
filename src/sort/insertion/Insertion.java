package sort.insertion;

import sort.Data;

public class Insertion {

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
        for (int i = 1; i < array.length; i++) {
            int tempValue = array[i];
            int j = i - 1;
            while (j >= 0
                    && ((orderBy.equals("DESC") && tempValue > array[j])
                    || (orderBy.equals("ASC") && tempValue < array[j]))) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tempValue;
        }

    }

}
