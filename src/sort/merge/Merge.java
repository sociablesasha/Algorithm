package sort.merge;

import sort.Data;

import java.util.Vector;

public class Merge {

    public static void main(String[] args) {
        // Default
        Data.print();

        // DESC
        // sort(Data.array, "DESC");
        // Data.print();

        // ASC
        sort(Data.array, "ASC");
        Data.print();
    }


    static void sort(Integer[] array, String orderBy) {
        split(array, 0, 9);
    }

    static void split(Integer[] array, Integer start, Integer end) {
        if (start >= end) return;

        Integer middle = (start + end) / 2;
        split(array, start, middle);
        split(array, middle + 1, end);

        merge(array, start, end, middle);
    }

    static void merge(Integer[] array, Integer start, Integer end, Integer middle) {
        Vector<Integer> result = new Vector<>();
        Integer i = start, j = middle + 1;

        while (i <= middle && j <= end)
            if (array[i] < array[j]) result.add(array[i++]);
            else if (array[i] > array[j]) result.add(array[j++]);

        while (i <= middle)
            result.add(array[i++]);

        while (j <= end)
            result.add(array[j++]);

        for (Integer index = start, key = 0; index <= end; index++) {
            array[index] = result.get(key++);
        }
    }

}
