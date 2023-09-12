package aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class aufgabe26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates( new int[]{1, 1, 2, 3}));

    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }

        return (int) set.stream().mapToInt(Integer::intValue).count();
    }
}
