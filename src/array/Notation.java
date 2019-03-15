package array;

public class Notation {

    public static void main(String[] args) {
        System.out.println(convert(10, 2));
    }

    static String convert(Integer n, Integer base) {
        String[] Numeral = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        Integer quotient = n / 2;
        Integer remainder = n % 2;

        if (quotient == 0)
            return Numeral[remainder];
        return convert(quotient, base).concat(Numeral[remainder]);
    }

}
