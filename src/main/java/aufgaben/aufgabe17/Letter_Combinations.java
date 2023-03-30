package aufgaben.aufgabe17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Letter_Combinations {

    public static final String input = "23";
    public static List<List<String>> returnList = new ArrayList<>();

    private static Map<Integer, char[]> digits = Map.of(
            2, "abc".toCharArray(),
            3, "def".toCharArray(),
            4, "ghi".toCharArray(),
            5, "jkl".toCharArray(),
            6, "mno".toCharArray(),
            7, "qprs".toCharArray(),
            8, "tuv".toCharArray(),
            9, "wxyz".toCharArray()
    );
    public static void main(String[] args) {

        returnList =  Arrays
                .stream(input.split(""))
                .map(Integer::parseInt)
                .flatMap(num -> digits.entrySet()
                        .stream()
                        .filter(entry -> Objects.equals(entry.getKey(), num))
                        .map(Map.Entry::getValue))
                .map(chars -> IntStream.range(0, chars.length)
                        .mapToObj(i -> String.valueOf(chars[i]))
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        System.out.println(cartesianProduct(returnList));
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
