package aufgaben;

public class aufgabe58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord( "Hallo ich bin Timo"));
    }
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
