package Recursion;

public class Factorial {

    public static long factorial(long n){
        if(n == 1)
        return 1;

        long sAns = factorial(n-1);
        long ans = n * sAns;

        return ans;
    }

    public static void main(String[] args){
        long fac = factorial(15);
        System.out.println(fac);
    }
}
