package CollectionFrameworks.Stacks;

import java.util.*;

public class ExtraBracket {
    public static boolean ExtraBrackets(String exp) {
        int n = exp.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = exp.charAt(i);
            // 1. ch is not closing
            if (ch != ')')
                st.push(ch);

            // 2. ch is closing
            else {
                // Nothing is in between => extra bracket
                // st.size() > 0 is used to not get error
                if (st.size() > 0 && st.peek() == '(')
                    return true;
                else {
                    // until you encounter an open keep popping the stack
                    // st.size() > 0 is used to not get error
                    while (st.size() > 0 && st.peek() != '(') {
                        st.pop();
                    }
                    st.pop(); // to pop open bracket
                }
            }
        }
        return false;
    }

    public class Main {
        public static void main(String[] args) {
            if (ExtraBrackets("((a + b) + (c + d))"))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
