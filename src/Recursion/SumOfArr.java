package Recursion;
import java.util.*;

public class SumOfArr {
    public static int sumOfArray(int n, int arr[]){
        if(n == 0){
            return 0;
        }
        int sAns = arr[n-1];
        int ans = sAns +  sumOfArray(n-1,arr);
        return ans;
    }

    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfArray(n, arr));
	}
}
