package strings;
import java.util.*;

// LC 125: Valid Palindrome
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome sol = new ValidPalindrome();

        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
        // expect true

        System.out.println(sol.isPalindrome("race a car"));
        // expect false

        System.out.println(sol.isPalindrome(" "));
        // expect true

        System.out.println(sol.isPalindrome("0P"));
        // expect false (this one trips many people up — '0' and 'p' are both alphanumeric, just different)
    }
}
