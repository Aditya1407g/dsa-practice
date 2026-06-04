package Recursion;

public class isPalindrome {

    public static boolean isPalindrome(String str) {
        return helper(str, 0, str.length() - 1);
    }

    private static boolean helper(String str, int left, int right) {
        if(left>=right) return true;
        return str.charAt(left)==str.charAt(right) && helper(str, left+1, right-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));   // expect: true
        System.out.println(isPalindrome("hello"));     // expect: false
        System.out.println(isPalindrome("a"));         // expect: true
        System.out.println(isPalindrome(""));          // expect: true
        System.out.println(isPalindrome("abba"));      // expect: true
        System.out.println(isPalindrome("abca"));      // expect: false
    }
}