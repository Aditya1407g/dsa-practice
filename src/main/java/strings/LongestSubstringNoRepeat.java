package strings;
import java.util.*;

// LC 3: Longest Substring Without Repeating Characters
class LongestSubstringNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        int maxlen =0;
        for(int i=0;i<s.length();i++){
            int curlen =0;
            boolean[] seen = new boolean[128];
            for(int j =i;j<s.length();j++){
                if(seen[s.charAt(j)] == false){
                    curlen++;
                    seen[s.charAt(j)]=true;
                }
                else {
                    break;
                }
            }
            if(curlen>maxlen) maxlen=curlen;
        }
        return maxlen;
    }

    // this is the optimal sliding window technique
    public int lengthOfLongestSubstring2(String s){
        boolean[] seen = new boolean[128];
        int left =0;
        int max=0;
        for(int right =0; right < s.length();right++){
            char c = s.charAt(right);
            while(seen[c]){
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[c]=true;
            max = Math.max(max, left-right+1);
        }
        StringBuilder st = new StringBuilder();

        return max;


    }

    public static void main(String[] args) {
        LongestSubstringNoRepeat sol = new LongestSubstringNoRepeat();

        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));  // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));     // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));    // 3
        System.out.println(sol.lengthOfLongestSubstring(""));          // 0
        System.out.println(sol.lengthOfLongestSubstring(" "));         // 1
        System.out.println(sol.lengthOfLongestSubstring("dvdf"));      // 3
        System.out.println(sol.lengthOfLongestSubstring("au"));        // 2
    }
}
