package aufgaben;

public class aufgabe1957 {
    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabbaaaa"));
    }
    public static String makeFancyString(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }

        return s;
    }
}
