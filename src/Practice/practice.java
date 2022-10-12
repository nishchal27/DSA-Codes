package Practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class practice {
    public static void main (String[] args)
	{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i =0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
		        int l = 0;
                int r = arr.length - 1;
                int mid = -1;
                while(l <= r){
                    mid = (l + r)/2;

                } 
               System.out.println(mid + "mid");
	}
}
