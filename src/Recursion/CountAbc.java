// https://course.acciojob.com/idle?question=8dff7ba2-333c-4674-90b7-d39b0bc7a070
// Countabc

package Recursion;

import java.util.*;

public class CountAbc {

    //without recursion
    public static int CountABC(String str, int i) {
        String subWord = "";
        int n = str.length();
        for (int j = 0; j < n - 2; j++) {
            subWord = "";
            char char1 = str.charAt(j);
            char char2 = str.charAt(j + 1);
            char char3 = str.charAt(j + 2);
            subWord = subWord + char1;
            subWord = subWord + char2;
            subWord = subWord + char3;
            // here use ".equals()" to compare the strings
            // simple == will not work with the variable
            if ("abc".equals(subWord) || "aba".equals(subWord)) {
                i++;
            }
        }
        return i;
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(CountABC(s, 0));

        }
    }
}
