package strings;

import java.util.*;

// LC 28: Find the Index of the First Occurrence in a String
class StrStr {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if (n == 0) return 0;
        if (n > h) return -1;

        for (int i = 0; i <= h - n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr sol = new StrStr();

        System.out.println(sol.strStr("sadbutsad", "sad"));       // 0
        System.out.println(sol.strStr("leetcode", "leeto"));      // -1
        System.out.println(sol.strStr("hello", "ll"));            // 2
        System.out.println(sol.strStr("a", "a"));                 // 0
        System.out.println(sol.strStr("mississippi", "issip"));   // 4
        System.out.println(sol.strStr("aaa", "aaaa"));            // -1

    }
}