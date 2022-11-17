package Recursion;

import java.util.*;

public class FindGCD {
    public static int findGCD(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b) {
            return a;
        }
        // a is greater
        if (a > b)
            return findGCD(a - b, b);
        return findGCD(b - a, a);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = findGCD(a, b);
        System.out.print(ans);
    }
}
