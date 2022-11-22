package Recursion;

import java.util.*;

public class RemoveX {

    public String removeX(String s, String newStr, int idx) {
        if (idx == s.length()) {
            return newStr;
        }
        if (s.charAt(idx) != 'x') {
            char a = s.charAt(idx);
            newStr = newStr + a;
        }
        String ans = removeX(s, newStr, idx + 1);
        return ans;
    }

    public String noX(String s) {
        String ans = removeX(s, "", 0);
        return ans;
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();
            RemoveX Obj = new RemoveX();
            System.out.println(Obj.noX(s));
        }
    }
}
