package Recursion;

import java.util.*;

public class BunnyEars2 {
    public static int bunnyEars(int n) {
        if (n == 1) {
            return 2;
        }
        int sAns = bunnyEars(n - 1);
        int ans;
        if (n % 2 == 0) {
            ans = sAns + 3;
        } else {
            ans = sAns + 2;
        }

        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = bunnyEars(n);
        System.out.print(total);
    }
}
