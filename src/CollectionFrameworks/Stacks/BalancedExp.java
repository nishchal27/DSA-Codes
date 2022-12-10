// https://course.acciojob.com/idle?question=e16170b9-480d-4bff-be85-dacd2afc2e48
// Balanced Expression

package CollectionFrameworks.Stacks;

import java.io.*;
import java.util.*;

public class BalancedExp {
    public static boolean match(char open, char close) {
        if (open == '(' && close == ')')
            return true;
        if (open == '{' && close == '}')
            return true;
        if (open == '[' && close == ']')
            return true;

        return false;
    }

    static boolean expBalanced(String str) {
        int nStr = str.length();
        String s = "";
        for (int i = 0; i < nStr; i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == ']'
                    || str.charAt(i) == '{' || str.charAt(i) == '}'
                    || str.charAt(i) == '(' || str.charAt(i) == ')') {
                s = s + str.charAt(i);
            }
        }
        int n = s.length();
        if (n == 1)
            return false;
        Stack<Character> st = new Stack<>();
        int c = 0;
        while (c < n) {
            if (s.charAt(c) == '(' || s.charAt(c) == '{' || s.charAt(c) == '[') {
                st.push(s.charAt(c));
            } else if (st.empty())
                return false;
            else if (match(st.peek(), s.charAt(c))) {
                st.pop();
            } else {
                return false;
            }
            c++;
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(expBalanced(str));
    }
}
