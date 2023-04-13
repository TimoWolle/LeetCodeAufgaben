package aufgaben.aufgabe1790;
import java.util.Arrays;


public class String_Swap {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("abcd", "dcba"));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            return true;
        } else if (s1.length() == s2.length()) {
            char[] s1Chars = s1.toLowerCase().toCharArray();
            char[] s2Chars = s2.toLowerCase().toCharArray();

            int count=0;

            for (int i = 0; i < s1Chars.length; i++) {
                if (s1Chars[i] != s2Chars[i]){
                    count++;

                    if (count > 2) return false;
                }
            }

            Arrays.sort(s1Chars);
            Arrays.sort(s2Chars);
            return Arrays.equals(s1Chars, s2Chars);
        }
        return false;
    }
}
