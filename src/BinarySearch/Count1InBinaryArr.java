// https://course.acciojob.com/idle?question=98e9bbba-6f59-4585-a38c-6f9bd3cd972a
// Count 1 in binary array

package BinarySearch;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Count1InBinaryArr {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0, r = n - 1;// initialize the search space
        int ans = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == 0) {
                r = m - 1;
            } else {
                l = m + 1;
                ans = m;
            }
        }
        System.out.print(ans + 1);
    }
}
