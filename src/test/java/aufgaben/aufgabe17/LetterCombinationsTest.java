package aufgaben.aufgabe17;

import aufgaben.aufgabe0_100.aufgabe17.LetterCombinations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class LetterCombinationsTest {

    @Test
    void letter_Combinations() {
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = LetterCombinations.letterCombinations("23");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void letter_Combinations_emptyString() {
        List<String> expected = Collections.emptyList();
        List<String> actual = LetterCombinations.letterCombinations("");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void letter_Combinations_singleDigit() {
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> actual = LetterCombinations.letterCombinations("2");

        Assertions.assertEquals(expected, actual);
    }
}