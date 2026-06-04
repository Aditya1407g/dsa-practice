package Recursion;

public class countVowels {

    public static int countVowels(String str) {
        if(str.isEmpty()) return 0;
        if (str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')
            return 1+countVowels(str.substring(1));
        return countVowels(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countVowels("banana"));    // expect: 3
        System.out.println(countVowels("xyz"));        // expect: 0
        System.out.println(countVowels("aeiou"));      // expect: 5
        System.out.println(countVowels("hello"));      // expect: 2
        System.out.println(countVowels(""));           // expect: 0
    }
}