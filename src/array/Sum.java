package array;

public class Sum {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(sum(array));
    }

    static Integer sum(Integer[] array) {
        Integer sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
