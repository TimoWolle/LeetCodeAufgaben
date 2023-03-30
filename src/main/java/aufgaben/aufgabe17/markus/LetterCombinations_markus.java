package aufgaben.aufgabe17.markus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations_markus {
    private final List<String> combinations = new ArrayList<>();

    private final Map<String, String> digitsToLetterMap = new HashMap<>();

    {
        digitsToLetterMap.put("2", "abc");
        digitsToLetterMap.put("3", "def");
        digitsToLetterMap.put("4", "ghi");
        digitsToLetterMap.put("5", "jkl");
        digitsToLetterMap.put("6", "mno");
        digitsToLetterMap.put("7", "pqrs");
        digitsToLetterMap.put("8", "tuv");
        digitsToLetterMap.put("9", "wxyz");
    }

    public List<String> letterCombinations(final String digits) {
        // if no digits are provided no backtracking needs to be started
        if (digits.length() == 0) {
            return combinations;
        }

        // start backtracking to get every possible letter combination
        backtrack("", digits);
        return combinations;
    }


    public void backtrack(final String path, final String digits) {
        // end of backtracking for this instance of letter combination is reached
        if (path.length() == digits.length()) {
            combinations.add(path);
            return;
        }

        // get the digit and the corresponding letters for the next iteration
        final String digit = String.valueOf(digits.charAt(path.length()));
        final String digitLetters = digitsToLetterMap.get(digit);

        // start backtrack for all possible letter combinations for the next digit
        for (final char c : digitLetters.toCharArray()) {
            backtrack(path + String.valueOf(c), digits);
        }
    }

}
