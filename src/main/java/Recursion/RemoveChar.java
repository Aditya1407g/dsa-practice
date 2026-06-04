package Recursion;

public class RemoveChar {

    public static String removeChar(String str, char c) {
        if(str.isEmpty()) return str;
        if(str.charAt(0)==c)
            return removeChar(str.substring(1),c);
        return str.charAt(0)+removeChar(str.substring(1),c);
    }

    public static void main(String[] args) {
        System.out.println(removeChar("banana", 'a'));    // expect: bnn
        System.out.println(removeChar("hello", 'l'));     // expect: heo
        System.out.println(removeChar("aaaa", 'a'));      // expect: (empty)
        System.out.println(removeChar("xyz", 'q'));       // expect: xyz
        System.out.println(removeChar("", 'a'));          // expect: (empty)
    }
}