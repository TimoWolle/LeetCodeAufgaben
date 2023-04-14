package aufgaben;

import java.util.Arrays;

public class aufgabe14 {
        public static void main(String[] args) {
            System.out.println(longestCommonPrefix(new String[]{"apple", "banapna", "banapa"}));
        }

    public static String longestCommonPrefix(String[] words) {
        String first = words[0];
        int maxLength = 0;
        String maxSequence = "";
        for (int i = 0; i < first.length(); i++) {
            for (int j = i + 1; j <= first.length(); j++) {
                String sequence = first.substring(i, j);
                if (!sequence.isEmpty() && allWordsStartWithPrefix(words, sequence)) {
                    if (sequence.length() > maxLength) {
                        maxLength = sequence.length();
                        maxSequence = sequence;
                    }
                }
            }
        }
        return maxSequence;
    }

    private static boolean allWordsStartWithPrefix(String[] words, String prefix) {
        for (String word : words) {
            if (!word.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }


}
