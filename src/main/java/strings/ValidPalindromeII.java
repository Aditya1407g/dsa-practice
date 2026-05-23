package strings;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start= 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                if(palindrome(s,start+1,end)){
                    return true;
                }
                else{
                    return palindrome(s, start, end-1);
                }
            }
            start++;
            end--;
        }
        return true;
    }
    static boolean palindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {
        ValidPalindromeII sol = new ValidPalindromeII();

        System.out.println(sol.validPalindrome("aba"));      // true
        System.out.println(sol.validPalindrome("abca"));     // true (delete 'c')
        System.out.println(sol.validPalindrome("abc"));      // false
        System.out.println(sol.validPalindrome("deeee"));    // true (delete 'd')
        System.out.println(sol.validPalindrome("cbbcc"));    // true (think about this one)
        System.out.println(sol.validPalindrome("a"));        // true
    }
}
