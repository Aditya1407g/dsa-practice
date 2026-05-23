package strings;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int x: count){
            if(x!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();

        System.out.println(sol.isAnagram("anagram", "nagaram"));  // true
        System.out.println(sol.isAnagram("rat", "car"));          // false
        System.out.println(sol.isAnagram("a", "ab"));             // false
        System.out.println(sol.isAnagram("", ""));                // true
        System.out.println(sol.isAnagram("ab", "ba"));            // true
    }
}
