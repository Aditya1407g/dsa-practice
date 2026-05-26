package bitwiseoperations;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));    // expected: true
        System.out.println(isPowerOfTwo(16));   // expected: true
        System.out.println(isPowerOfTwo(3));    // expected: false
        System.out.println(isPowerOfTwo(0));    // expected: false
        System.out.println(isPowerOfTwo(-8));   // expected: false
    }

    static boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}
