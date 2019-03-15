package set;

public class SetTester {

    public static void main(String[] args) {
        IntegerSet setOne = new IntegerSet(new Integer[]{0, 2, 8, 10});
        IntegerSet setTwo = new IntegerSet(new Integer[]{0, 2, 1, 3, 5, 8, 9});

        setOne.sort();
        setTwo.sort();

        Integer i = 0, j = 0;
        Integer temp = 0;
        while (true) {
            temp++;
            if (i >= setOne.size()) break;
            if (j >= setTwo.size()) break;
            if (setOne.get(i) < setTwo.get(j)) break;

            if (setOne.get(i) == setTwo.get(j)) {
                System.out.println(setOne.get(i) + " > array" + "[" + j + "]");
                i++;
                j++;
            } else if (setOne.get(i) > setTwo.get(j)) {
                j++;
            }
        }
        System.out.println("비교횟수 > " + temp);
    }

}
