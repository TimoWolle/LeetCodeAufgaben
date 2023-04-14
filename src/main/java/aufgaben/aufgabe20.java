package aufgaben;

import java.util.Stack;

public class aufgabe20 {

    public static void main(String[] args) {
        System.out.println(isValid("()()()()()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    System.out.println("Fehlerhafte Reihenfolge der Klammern!");
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
