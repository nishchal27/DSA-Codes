package Recursion;

import java.util.*;

public class MinAndMax {

public static int maxOfArray(int idx, int arr[]){

     if(idx == arr.length){
        return 0;
     }
    

int sAns = maxOfArray(idx+1, arr);
int ans = Math.max(arr[idx],sAns);

return ans;

    // if(idx == arr.length){
    //     return 0;
    // }

    // int sAns = maxOfArray(idx+1, arr);
    // int ans = 0;

    // if(sAns > arr[idx]){
    //     ans = sAns;
    // }else{
    //     ans = arr[idx];
    // }
    // return ans;
}

public static int minOfArray(int idx, int arr[]){

     if(idx == arr.length){
        return arr[idx-1];
     }
    

int sAns = minOfArray(idx+1, arr);
int ans = Math.min(arr[idx],sAns);

return ans;

    // if(idx == arr.length){
    //     return arr[idx-1];
    // }

    // int sAns = minOfArray(idx+1, arr);
    // int ans = 0;

    // if(sAns < arr[idx]){
    //     ans = sAns;
    // }else{
    //     ans = arr[idx];
    // }
    // return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minOfArray(0, arr));
    }
}
