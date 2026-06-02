package Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    static int fibo(double n){
        if(n==0) return 0;
        if(n==1) return 1;

        return fibo(n-1)+fibo(n-2);
    }
}
