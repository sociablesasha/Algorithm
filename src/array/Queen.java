package array;

public class Queen {

    static boolean[] flag_line = new boolean[8];
    static boolean[] flag_diagonal_left = new boolean[15];
    static boolean[] flag_diagonal_right = new boolean[15];

    static Integer[] position = new Integer[8];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", position[i]);
        }
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            // System.out.println(i + ":" + j);
            if (flag_line[j] == true
                    || flag_diagonal_left[i + j] == true
                    || flag_diagonal_right[j - i + 7] == true) continue;
            position[i] = j;
            if (i == 7)
                print();
            else {
                flag_line[j] = flag_diagonal_left[i + j] = flag_diagonal_right[j - i + 7] = true;
                set(i + 1);
                flag_line[j] = flag_diagonal_left[i + j] = flag_diagonal_right[j - i + 7] = false;
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
