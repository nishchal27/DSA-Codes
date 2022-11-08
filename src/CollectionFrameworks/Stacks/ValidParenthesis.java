package CollectionFrameworks.Stacks;
import java.util.*;

public class ValidParenthesis {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            // if str.charAt(i) is opening br -> push to stack
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else {// its a closing bracket
                    // A. Stack is empty
                if (st.empty()) {
                    return false;
                    // B .1
                } else if (match(st.peek(), str.charAt(i))) {
                    st.pop();
                }
                // B .2
                else {// closing bracket doesn't match opening bracket
                    return false;
                }
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }

    static boolean match(char open, char close) {
        if (open == '(' && close == ')')
            return true;
        if (open == '{' && close == '}')
            return true;
        if (open == '[' && close == ']')
            return true;

        return false;
    }
}
