package Recursion;

import java.util.*;

public class DP_HouseRob {

    public static int HouseRobber(int idx, int end, int[] arr) {
        if (idx > end) {
            return 0;
        }
        // rob current idx
        int rob = HouseRobber(idx + 2, end, arr) + arr[idx];
        // skip current idx
        int skip = HouseRobber(idx + 1, end, arr);

        int ans = Math.max(rob, skip);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        int startFrom0 = HouseRobber(0, n - 2, arr);
        int startFrom1 = HouseRobber(1, n - 1, arr);

        int ans = Math.max(startFrom0, startFrom1);
        System.out.println(ans);

    }
}
