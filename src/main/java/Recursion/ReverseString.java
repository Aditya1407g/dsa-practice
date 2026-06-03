package Recursion;


public class ReverseString {

    static String reverse(String str) {
        if(str.isEmpty()) return str;
        char now = str.charAt(0);
        return  reverse(str.substring(1)) + now;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));   // expect: olleh
        System.out.println(reverse("a"));        // expect: a
        System.out.println(reverse(""));         // expect: (empty line)
    }
}
