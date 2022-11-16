package Recursion;
import java.util.*;

public class SumOfNaturalNums {

    public static int sumOfNaturalNum(int n){
        if(n == 1)
        return 1;

        int sAns = sumOfNaturalNum(n-1);
        int ans = n + sAns;

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfNaturalNum(n);
        System.out.println(sum);
      }
}
