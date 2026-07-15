package Recursion;

import java.util.ArrayList;

public class Premutation {
    public static void main(String[] args) {
//        permutation("", "abcdefghijklmopq");

//        System.out.println(permutationReturn("" , "abcd"));
        System.out.println(permutationCount("", "abkkkc"));
    }
    static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permutationReturn(String p , String up){

        ArrayList<String> rval = new ArrayList<>();
        if(up.isEmpty()){
            rval.add(p);
            return rval;
        }
        char ch = up.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            rval.addAll(permutationReturn(f+ch+s, up.substring(1)));
        }
        return rval;
    }
    static int  permutationCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count +=permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
