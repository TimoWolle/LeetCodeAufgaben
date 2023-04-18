package aufgaben;

import java.math.BigInteger;

public class aufgabe67 {
    public static void main(String[] args) {
        System.out.println((addBinary("11","111")));
    }
    public static String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
}
