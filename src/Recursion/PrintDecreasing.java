package Recursion;

public class PrintDecreasing {

    //decrease n
    public static void pd(int n){
        if(n == 0){
        return;
        }
        System.out.println(n);
        pd(n-1);
    }
    //increase n
    public static void pi(int n){
        if(n == 0){
        return;
        }
        pi(n-1);
        System.out.println(n);
    }

    public static void DI(int n){
        pd(n);
        pi(n);
    }

    public static void main(String[] args){
        DI(5);
    }
}
