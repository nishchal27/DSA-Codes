package Recursion;
import java.util.*;

public class FirstAndLastIndex {

    public static int firstIndex(int idx, int arr[], int t){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == t){
            return idx;
        }
        int ans = firstIndex(idx + 1, arr, t);

        return ans;
    }

    public static int lastIndex(int idx, int arr[], int t){
        if(idx == arr.length){
            return -1;
        }

        int sAns = lastIndex(idx+1, arr, t);
        int ans = 0;

        if(sAns == -1){
            if(arr[idx] == t){
                ans = idx;
            }else{
                ans = sAns;
            }
        }else{
            ans = sAns;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lastIndex(0, arr, 3));
    }
}
