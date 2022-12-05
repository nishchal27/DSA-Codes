// https://course.acciojob.com/idle?question=00744049-8dcb-4429-8ae0-f3607545f1a5
// Contains Duplicate

package TwoPointers;

import java.util.*;

public class ContainsDuplicate {
    public static void duplicates(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            System.out.print(false);
            return;
        }
        Arrays.sort(arr);
        boolean result = false;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            if (arr[i] == arr[j]) {
                result = true;
                break;
            }
            if (j == n - 1)
                break;
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        duplicates(arr);
        sc.close();
    }
}
