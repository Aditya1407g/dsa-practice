package Recursion;

import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr = {0,2,5,3,6,3,3,5};
        ArrayList<Integer> ans = findAllIndex(arr,3,0);
        System.out.println(ans);
    }

    static ArrayList<Integer>  findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> rval = new ArrayList<>();
        if(index==arr.length) return rval;
        if(arr[index] == target) rval.add(index);
        rval.addAll(findAllIndex(arr,target,index+1));
        return rval;
    }
}
