package Recursion;

public class PrintFibonacciNums {

    //nth fib number
    static int fib(int n)
    {
       if (n == 1)
       return 0;

       if (n == 2)
       return 1;

       else
        return fib(n - 1) + fib(n - 2);
    }

    //nth even fib num
    static long evenFib(int n){
        if(n<1){
            return n;
        }
        if(n == 1){
            return 2;
        }

        return ((4 * evenFib(n-1)) + evenFib(n-2));
    }

    public static void main(String[] args){
       System.out.println(fib(5)); 
       System.out.println(evenFib(10)); 
    }
}
