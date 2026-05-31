package Maths;

import java.util.Arrays;

public class GCDOfArray {
    public static void main(String[] args) {
        int[] test1 = {2, 5, 6, 9, 10};
        System.out.println(findGCD(test1));  // expected: 1

        int[] test2 = {7, 5, 6, 8, 3};
        System.out.println(findGCD(test2));  // expected: 1

        int[] test3 = {3, 3};
        System.out.println(findGCD(test3));  // expected: 3
    }

    static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length - 1];
        return gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
