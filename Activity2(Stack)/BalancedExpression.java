
import java.util.Stack;

public class BalancedExpression {

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "(A+B)";
        String exp2 = "(A+B";

        System.out.println(exp1 + " : "
                + (isBalanced(exp1) ? "Balanced" : "Not Balanced"));

        System.out.println(exp2 + " : "
                + (isBalanced(exp2) ? "Balanced" : "Not Balanced"));
    }
}
