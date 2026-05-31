package Maths;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));   // expected: true
        System.out.println(isHappy(2));    // expected: false
        System.out.println(isHappy(1));    // expected: true
        System.out.println(isHappy(7));    // expected: true
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    static int sumOfSquares(int n) {
        int a = 0;
        while (n > 0) {
            int temp = n % 10;
            a += temp * temp;
            n /= 10;
        }
        return a;
    }
}
