import java.util.Stack;
import java.util.Scanner;

public class BalancedParenthesis {

    public static boolean isBalanced(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

           
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        
        return st.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isBalanced(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
