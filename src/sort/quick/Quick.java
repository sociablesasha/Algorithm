package sort.quick;

import sort.Data;

public class Quick {

    public static void main(String[] args) {
        // Default
        Data.print();

        // DESC
//        sort(Data.array, "DESC");
//        Data.print();

        // ASC
        sort(Data.array, "ASC");
        Data.print();
    }

    static void sort(Integer[] array, String orderBy) {
        quick(array, 0, 9);
    }

    static void quick(Integer[] array, Integer start, Integer end) {
        if (start >= end) return;

        Integer pivot = start;
        Integer low = start + 1;
        Integer high = end;

        while (low <= high) {
            while (low <= end && array[pivot] >= array[low]) low++;
            while (array[pivot] < array[high]) high--;

            if (low <= high) swap(array, low, high);
        }

        swap(array, pivot, high);

        quick(array, start, high - 1);
        quick(array, high + 1, end);
    }

    static void swap(Integer[] array, int i, int j) {
        Integer temp = null;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
