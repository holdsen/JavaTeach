package HomeWork16;

import java.util.ArrayDeque;
import java.util.Deque;
public class Lesson3 {
    public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("() : " + isBalanced("()"));
        System.out.println("[()] : " + isBalanced("[()]"));
        System.out.println("{[(])} : " + isBalanced("{[(])}"));
        System.out.println("{{[]()}}}} : " + isBalanced("{{[]()}}}}")); // я ссдааллся(((
    }
}