package aufgaben;

import java.util.Arrays;
import java.util.HashSet;

public class aufgabe35 {
    public static void main(String[] args) {
        System.out.println(searchInsert( new int[]{1, 1, 2, 3, 7}, 5));

    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < target) return ++i;
        }
        return 0;
    }
}
