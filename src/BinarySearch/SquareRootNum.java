// https://course.acciojob.com/idle?question=71891482-69b9-4bd3-a1ae-1945179ee04f
// Square root of a number

package BinarySearch;

import java.util.*;

public class SquareRootNum {
    public static void main(String[] args) throws java.lang.Exception {
        // ans will lie between l and r
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long l = 0, r = n;
        long mid, ans = 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid > n) {
                r = mid - 1;
            } else if (mid * mid < n) {
                l = mid + 1;
                // but this could be our ans also
                // if (mid +1) * (mid + 1) > n
                // it means -> mid < sqrt(n) < mid + 1
                // it means mid is the integer part and hence our ans
                if ((mid + 1) * (mid + 1) > n) {
                    ans = mid;
                    break;
                }
            } else {// mid * mid == n
                ans = mid;
                break;
            }
        }
        System.out.println(ans);
    }
}
