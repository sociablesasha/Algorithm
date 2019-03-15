package gcd;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(22, 8));
    }

    static Integer greatestCommonDivisor (Integer x, Integer y) {
        if (y == 0)  return x;
        else return greatestCommonDivisor(y, x % y);
    }

}
