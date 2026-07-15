package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {

//        String str = "abc";
//        String pvr = "";
//        //subSeq(pvr, str);
//        System.out.println(subseq1(pvr, str));
        int[] arr = {1,2,2};
        ArrayList<ArrayList<Integer>> rval = subSetIterationRepeat(arr);
        for(ArrayList<Integer> list : rval){
            System.out.println(list);
        }

    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p,up.substring(1));
    }

    static ArrayList<String> subseq1(String p , String up){
        ArrayList<String> rval = new ArrayList<>();
        if(up.isEmpty()){
            if(!p.isEmpty()) rval.add(p);
            return rval;
        }
        char ch = up.charAt(0);
        rval.addAll(subseq1(p+ch, up.substring(1)));
        rval.addAll(subseq1(p, up.substring(1)));
        return rval;
    }

    static ArrayList<ArrayList<Integer>> subSetIteration(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());

        for(int x :arr){
            int n = outer.size();
            for(int i =0;i<n;i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(x);
                outer.add(inner);
            }
        }
        return outer;
    }

    static ArrayList<ArrayList<Integer>> subSetIterationRepeat(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add( new ArrayList<Integer>());
        int start=0, end=0;

        for(int i =0;i<arr.length;i++){
            start =0;
            if(i>0&& arr[i]==arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j= start;j<n;j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
