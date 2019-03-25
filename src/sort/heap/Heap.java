package sort.heap;

import sort.Data;

public class Heap {

    public static void main(String[] args) {
        // Default
        Data.print();

        // DESC
//        sort(Data.array, "DESC");
//        Data.print();
//
//        // ASC
        sort(Data.array, "ASC");
        Data.print();
    }

    static void sort(Integer[] array, String orderBy) {
        // Convert Heap
        for (int i = (array.length - 1) / 2; i >= 0; i--)
            downHeap(Data.array, i, array.length - 1);

        // Heap Sort
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            downHeap(array, 0, i - 1);
        }
    }

    static void downHeap(Integer[] array, int left, int right) {
        int temp = array[left];
        int child;
        int parent;

        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && array[cr] > array[cl]) ? cr : cl;
            if (temp >= array[child]) break;
            array[parent] = array[child];
        }
        array[parent] = temp;
    }

    static void swap(Integer[] array, int i, int j) {
        Integer temp = null;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
