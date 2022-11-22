package Recursion;
import java.util.*;

public class ArrOfIndexs {

    public static int[] getIndices(int idx, int arr[], int tar, int count){
        if(idx == arr.length){
            int newArr[] = new int[count];
            return newArr;
            //we're basically returning a reference(address) of the that array, not the actual array.
        }

        if(arr[idx] == tar){
            count++;
        }
        
        int ans[] = getIndices(idx+1, arr, tar, count);
        //here after recursion we're getting refernce(address) of the array from the context.

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
        System.out.println(Arrays.toString(getIndices(0, arr, 3,0)));
    }
}
