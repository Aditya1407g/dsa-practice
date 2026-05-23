package strings;

import java.util.*;

// LC 344: Reverse String
class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseString sol = new ReverseString();

        char[] test1 = {'h','e','l','l','o'};
        sol.reverseString(test1);
        System.out.println(Arrays.toString(test1));
        // expect [o, l, l, e, h]

        char[] test2 = {'H','a','n','n','a','h'};
        sol.reverseString(test2);
        System.out.println(Arrays.toString(test2));
        // expect [h, a, n, n, a, H]

        char[] test3 = {'a'};
        sol.reverseString(test3);
        System.out.println(Arrays.toString(test3));
        // expect [a]

        char[] test4 = {};
        sol.reverseString(test4);
        System.out.println(Arrays.toString(test4));
        // expect []
    }
}