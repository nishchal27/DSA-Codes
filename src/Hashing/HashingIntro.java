package Hashing;
import java.util.*;

public class HashingIntro {
    public static void main(String[] args){
        //2, 5, 12, 14, 9
        int arr[] = new int[15];
        Arrays.fill(arr, -1);
        arr[2] = 2;
        arr[5] = 5;
        arr[12] = 12;
        arr[14] = 14;
        arr[9] = 9;

        //code a search function, which return the index of target element if it exists otherwise returns -1

        System.out.println(search(2, arr)); //2
        System.out.println(search(13, arr)); //-1
        System.out.println(search(5, arr)); //5
        System.out.println(search(11, arr)); //-1
    }
    static int search(int target, int arr[]){
        if(arr[target] != -1){
            return target;
        }else{
            return -1;
        }
    }
}
