package Recursion;
import java.util.*;

public class CalcXRaisedToPowN {
    public static int power(int x, int n){
        if(n == 0)
        return 1;

        int sAns = power(x,n-1);
        int ans = x * sAns;

        return ans;
    }

    //power Logarithmic
    // someone ask tell it is Logarithmic time complexity "O(logn)"
    public static int powerLog(int x, int n){
        if(n == 0)
        return 1;

        int sAns = powerLog(x,n/2);
        int ans;
        if(n % 2 == 0){
            ans = sAns * sAns;
        }else{
            ans = sAns * sAns * x;
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int square = powerLog(x,n);
        System.out.println(square);
      }
}
