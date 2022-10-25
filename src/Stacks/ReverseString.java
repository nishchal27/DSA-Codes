// https://course.acciojob.com/idle?question=6769c6d4-2193-4378-b704-08ab89c117bf
// Reverse String Using Stack

package Stacks;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // create a stack to store character
        Stack<Character> st = new Stack<>();

        // store the characters of the string in stack
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        // new we have the stack populated correctly
        // top new down, the stack stores reverse of string str

        String ans = "";
        // you want to add the currently popped element to get
        // to the end
        while (!st.empty()) {
            // System.out.print(st.pop());
            ans = ans + st.pop();
        }
        System.out.print(ans);
    }
}
