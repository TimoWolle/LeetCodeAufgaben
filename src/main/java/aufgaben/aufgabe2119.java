package aufgaben;

public class aufgabe2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(3501));
    }
    public static boolean isSameAfterReversals(int num) {
        String nums = String.valueOf(num);
        return nums.equals(nums.replaceFirst("(?<=\\d)0+$", ""));
    }
}
