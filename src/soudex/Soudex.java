package soudex;

import java.util.Objects;

public class Soudex {

    public static void main(String[] args) {
        String a = Soundex("Robert");
        String b = Soundex("Rubert");

        System.out.println(Objects.equals(a, b));
    }

    static String Soundex(String word) {
        Character head = word.charAt(0);
        String body = word.substring(1)
                .replaceAll("[aeiouhwy]", "")
                .replaceAll("[bfpv]", "1")
                .replaceAll("[cgjkqsxz]", "2")
                .replaceAll("[dt]", "3")
                .replaceAll("[l]", "4")
                .replaceAll("[mn]", "5")
                .replaceAll("[r]", "6");

        return head + body;
    }

}
