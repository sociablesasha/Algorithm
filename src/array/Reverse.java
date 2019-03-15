package array;

public class Reverse {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, (array.length - i - 1));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void swap(Integer[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

}
