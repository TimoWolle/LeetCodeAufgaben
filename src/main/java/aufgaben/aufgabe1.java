package aufgaben;

import java.util.HashMap;

class aufgabe1 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,3,5,7}, 8));
    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int addition = target - nums[i];
            if (map.containsKey(addition)) {
                result[0] = i;
                result[1] = map.get(addition);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}