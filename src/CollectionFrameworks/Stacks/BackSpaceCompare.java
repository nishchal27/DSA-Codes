// https://course.acciojob.com/idle?question=25c52021-b22e-4b2a-9183-fa026ba80c8b
// Backspace String Compare

package CollectionFrameworks.Stacks;

import java.util.*;

class Solution {

    public static boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '#' && s1.size() > 0)
                s1.pop();
            else
                s1.push(ch);
        }
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            if (ch == '#' && s2.size() > 0)
                s2.pop();
            else
                s2.push(ch);
        }
        return s1.equals(s2);
    }
}

class BackSpaceCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Solution Obj = new Solution();
        System.out.print(Obj.backspaceCompare(s, t));
    }
}