package Recursion;
import java.util.*;

public class PrintArray {

    public static void printArray(int idx, int arr[]){
        if(idx == arr.length){
            return;
        }

        System.out.print(arr[idx] + " ");
        printArray(idx + 1, arr);
    }

    public static void main(String args[]){
        int arr[] = {3,7,9,5,6};
        printArray(0, arr);
    }
}
