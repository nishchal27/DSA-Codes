package Recursion;

import java.util.*;

public class PairStar {

    public String insertStar(String str, String newStr, int idx) {
        if (idx == str.length()) {
            return newStr;
        }
        char in = str.charAt(idx);
        newStr = newStr + in;
        if (idx + 1 < str.length()) {
            if (str.charAt(idx) == str.charAt(idx + 1)) {
                char a = '*';
                newStr = newStr + a;
            }
        }
        String ans = insertStar(str, newStr, idx + 1);
        return ans;
    }

    public String PairStar(String str) {
        String ans = insertStar(str, "", 0);
        return ans;
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            PairStar Obj = new PairStar();
            System.out.println(Obj.PairStar(s));
        }
    }
}
