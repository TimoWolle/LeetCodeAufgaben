package aufgaben.aufgabe13;

import java.util.Map;

public class Roman_To_Int {
    public static void main(String[] args) {
        System.out.println(romanToInt("VVI"));
    }
    private static Map<Character, Integer> roman = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = roman.get(currentChar);
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = roman.get(nextChar);
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}
