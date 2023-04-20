//https://course.acciojob.com/idle?question=de4d436a-d8e4-4b59-ba91-a2d138d040a4
//Count 7
package Gym;

import java.util.*;

public class Count7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
        sc.close();
    }
//comment
    public static int count7(int n) {
        if (n < 1)
            return 0;
        if (n % 10 == 7)
            return 1 + count7(n / 10);
        else
            return count7(n / 10);

    }
}
