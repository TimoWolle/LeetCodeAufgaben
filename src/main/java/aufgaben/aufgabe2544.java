package aufgaben;

public class aufgabe2544 {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(886996));
    }
    public static int alternateDigitSum(int n) {
        String numStr = Integer.toString(n);
        int count = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            
            if(i%2==1){
                count -= digit;
            }else{
                count += digit;
            }
        }
        
        return count;
    }
}
