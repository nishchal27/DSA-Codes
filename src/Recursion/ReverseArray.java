package Recursion;
import java.util.*;

public class ReverseArray {
    public static void reverseArray(int n, int arr[]){
        if(n == 0){
            return;
        }
        System.out.print(arr[n-1] + " ");
        reverseArray(n-1, arr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(n, arr);
      }
}
