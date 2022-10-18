package Practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class practice {
    static int searchInSorted(int arr[], int N, int K)
    {
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2; 
            System.out.println(mid + " mid");
            if(mid == K){
                return 1;
            }
            else if(K > arr[mid]){
                low = mid + 1;
            }
            else if(K < arr[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,6};
        System.out.println(searchInSorted(arr, 5, 6));
    }
}