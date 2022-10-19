package Practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class practice {
    static int first(int arr[], int K)
    {
        int low = 0, high = arr.length - 1;
        int resFirst = -1;
        while(low <= high){
            int mid = (low + high) / 2; 
            if(arr[mid] == K)
                {
                    resFirst = mid;
                    high = mid - 1;
                }
            else if(arr[mid] < K)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return resFirst;
    }
    static int last(int arr[], int K)
    {
        int low = 0, high = arr.length - 1;
        int resLast = -1;
        while(low <= high){
            int mid = (low + high) / 2; 
            if(arr[mid] == K)
                {
                    resLast = mid;
                    low = mid + 1;
                }
            else if(arr[mid] < K)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return resLast;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,3,3,4,4,6,6};
        System.out.print(first(arr, 4) + " ");
        System.out.print(last(arr, 4));
    }
}
