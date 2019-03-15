package hanoi;

public class Hanoi {

    public static void main(String[] args) {
        hanoi(3, 1, 3);
    }

    static void hanoi(Integer no, Integer x, Integer y) {
        if (no > 1)
            hanoi(no - 1, x, 6 - x - y);

        System.out.println("[" + no + "] : " + x + " > " + y);

        if  (no > 1)
            hanoi(no - 1, 6 - x - y, y);
    }

}
