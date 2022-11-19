package Recursion;

import java.util.*;

public class SumOfDigits {

    public static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }

        int remainder = n % 10;
        int ans = remainder + sumDigit(n/10);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigit(n));
    }
}
