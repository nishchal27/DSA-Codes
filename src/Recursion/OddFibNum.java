package Recursion;

import java.util.*;

public class OddFibNum {
    public static int getNthFib(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        int ans = getNthFib(n - 2) + getNthFib(n - 1);
        return ans;
    }

    public static int helpBob(int n) {
        //formula (3x -1) / 2
        int fib = (3 * n - 1) / 2;
        return getNthFib(fib);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(helpBob(n));
        sc.close();
    }
}
