package Recursion;

public class Factorial {

    public static int factorial(int n){
        if(n == 1)
        return 1;

        int sAns = factorial(n-1);
        int ans = n * sAns;

        return ans;
    }

    public static void main(String[] args){
        int fac = factorial(5);
        System.out.println(fac);
    }
}
