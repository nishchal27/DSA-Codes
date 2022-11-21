package Recursion;
import java.util.*;

public class ArrOfIndexs {

    public static int[] getIndices(int idx, int arr[], int tar, int count){
        if(idx == arr.length){
            int newArr[] = new int[count];
            return newArr;
        }

        if(arr[idx] == tar){
            count++;
        }
        
        int ans[] = getIndices(idx+1, arr, tar, count);
        if(arr[idx] == tar){
            ans[count-1] = idx;
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
        System.out.println(Arrays.toString(getIndices(0, arr, 1,0)));
    }
}
