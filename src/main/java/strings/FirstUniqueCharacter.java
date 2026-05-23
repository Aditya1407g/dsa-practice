package strings;

import java.util.*;

// LC 387: First Unique Character in a String
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i =0;i<s.length();i++){
            if(count[s.charAt(i)-'a'] ==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter sol = new FirstUniqueCharacter();

        System.out.println(sol.firstUniqChar("leetcode"));      // 0
        System.out.println(sol.firstUniqChar("loveleetcode"));  // 2
        System.out.println(sol.firstUniqChar("aabb"));          // -1
        System.out.println(sol.firstUniqChar("z"));             // 0
        System.out.println(sol.firstUniqChar(""));              // -1
    }
}
