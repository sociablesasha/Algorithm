package rsa;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RSA {

    public static void main(String[] args) {
        Long p, q, n, φn, e, d;
        Long plain, encrypt, decrypt;

        p = 5L;
        q = 3L;

        n = p * q;
        φn = (p - 1) * (q - 1);

        e = 7L;

        Map<String, Long> KU = Stream.of(new Object[][]{
                {"e", e},
                {"n", n},
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Long) data[1]));

        d = coercion(KU);

        Map<String, Long> KR = Stream.of(new Object[][]{
                {"d", d},
                {"n", n},
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Long) data[1]));

        System.out.println(KU);
        System.out.println(KR);

        plain = 13L;
        encrypt = encryption(plain, KU);
        decrypt = decryption(plain, KR);

        System.out.println(plain + ":" + encrypt + ":" + decrypt);
    }

    static Long encryption(Long text, Map<String, Long> KU) {
        return (long) Math.pow(text, KU.get("e")) % KU.get("n");
    }

    static Long decryption(Long text,Map<String, Long> KR) {
        return (long) Math.pow(text, KR.get("d")) % KR.get("n");
    }

    static Long coercion(Map<String, Long> KU) {
        Long n = KU.get("n");
        Long e = KU.get("e");

        Integer count = 0;

        while (true) {
            if (((n * count) + 1) % e == 0) break;
            else count++;
        }

        return ((n * count) + 1) / e;
    }

}
