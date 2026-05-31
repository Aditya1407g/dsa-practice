package Maths;

public class PowXN {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));   // expected: 1024.0
        System.out.println(myPow(2.1, 3));    // expected: 9.261
        System.out.println(myPow(2.0, -2));   // expected: 0.25
        System.out.println(myPow(1.0, 0));    // expected: 1.0
    }

    static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) result *= x;
            x *= x;
            N >>= 1;
        }
        return result;
    }
}
