package Recursion;
import java.util.*;

public class Array11 {
    static int count = 0;

    public static int array11(int arr[], int idx) {
        if (idx == arr.length) {
            return count;
        }
        if (arr[idx] == 11) {
            count++;
        }
        array11(arr, idx + 1);
        return count;

    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(array11(arr, 0));
    }
}
