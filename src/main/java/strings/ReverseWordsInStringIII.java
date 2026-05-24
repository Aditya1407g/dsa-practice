package strings;
import java.util.*;

// LC 557: Reverse Words in a String III
class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start=0;
        for(int i =0;i<=arr.length;i++){
            if(i==arr.length || arr[i] == ' '){
                int left = start, right = i-1;
                while (left<right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                start = i+1;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseWordsInStringIII sol = new ReverseWordsInStringIII();

        System.out.println(sol.reverseWords("Let's take LeetCode contest"));
        // expect "s'teL ekat edoCteeL tsetnoc"

        System.out.println(sol.reverseWords("Mr Ding"));
        // expect "rM gniD"

        System.out.println(sol.reverseWords("a"));
        // expect "a"

        System.out.println(sol.reverseWords("ab cd"));
        // expect "ba dc"
    }
}
