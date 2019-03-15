package hanoi;

public class MyHanoi {

    public static void main(String[] args) {
        hanoi(3, 1, 3, 2);
    }

    static void hanoi(Integer no, Integer to, Integer from, Integer help) {
        if (no == 0)
            return;

        hanoi(no - 1, from, help, to);
        System.out.println("[" + no + "] : " + to + " > " + from);
        hanoi(no - 1, help, to, from);
    }

}
