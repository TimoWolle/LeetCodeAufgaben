package aufgaben.aufgabe0_100.aufgabe1;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        System.out.println(twoSum());
    }

    public int[] twoSum(int[] nums, int target) {
        Arrays.stream(nums)
                .anyMatch(num -> num == target);


        return nums;
    }
}
