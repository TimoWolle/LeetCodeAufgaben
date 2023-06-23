package aufgaben.aufgabe0_100.aufgabe17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    private static Map<Integer, char[]> digitMap = Map.of(
            2, "abc".toCharArray(),
            3, "def".toCharArray(),
            4, "ghi".toCharArray(),
            5, "jkl".toCharArray(),
            6, "mno".toCharArray(),
            7, "qprs".toCharArray(),
            8, "tuv".toCharArray(),
            9, "wxyz".toCharArray()
    );


    public static List<String> letterCombinations(String digits) {

        if (digits.length() == 0) return new ArrayList<>();

        return  cartesianProduct(Arrays.stream(digits.split(""))
                        .map(Integer::parseInt)
                        .flatMap(num -> digitMap.entrySet()
                                .stream()
                                .filter(entry -> Objects.equals(entry.getKey(), num))
                                .map(Map.Entry::getValue))
                        .map(chars -> IntStream.range(0, chars.length)
                                .mapToObj(i -> String.valueOf(chars[i]))
                                .collect(Collectors.toList()))
                        .collect(Collectors.toList()));


    }

    public static List<String> cartesianProduct(List<List<String>> lists) {
        return lists.stream()
                .reduce(List.of(""),
                        (list1, list2) -> list1.stream()
                                .flatMap(str1 -> list2.stream()
                                        .map(str2 -> str1 + str2))
                                .collect(Collectors.toList()));
    }
}
