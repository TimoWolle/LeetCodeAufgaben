package aufgaben;

import java.math.BigInteger;
import java.util.Arrays;

public class aufgabe66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }

    public static int[] plusOne(int[] digits) {
        String numStr = Arrays.toString(digits).replaceAll("[^0-9]", "");
        BigInteger num = new BigInteger(numStr).add(BigInteger.ONE);

        return Arrays.stream(num.toString().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
