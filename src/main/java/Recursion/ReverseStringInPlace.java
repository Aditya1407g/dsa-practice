package Recursion;

public class ReverseStringInPlace {

    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    private void helper(char[] s, int left, int right) {
        if(left>=right){
            return;
        }
        char temp = s[left];
        s[left]= s[right];
        s[right]= temp;
        helper(s,left+1,right-1);
    }

    public static void main(String[] args) {
        ReverseStringInPlace sol = new ReverseStringInPlace();

        char[] s1 = {'h','e','l','l','o'};
        sol.reverseString(s1);
        System.out.println(s1);   // expect: olleh

        char[] s2 = {'H','a','n','n','a','h'};
        sol.reverseString(s2);
        System.out.println(s2);   // expect: hannaH
    }
}