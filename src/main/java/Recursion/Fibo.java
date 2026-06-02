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
    static int fib(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];

        dp[n] = fib(dp[n-1],dp)+fib(dp[n-2],dp);

        return dp[n];
    }
}
