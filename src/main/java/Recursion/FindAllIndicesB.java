package Recursion;

import java.util.ArrayList;

public class FindAllIndicesB {

    public static ArrayList<Integer> findAll(int[] arr, int target, int index) {
        if(index ==arr.length) return new ArrayList<>();
        ArrayList<Integer> rval = findAll(arr, target, index+1);
        if(arr[index]==target) rval.add(0,index);
        return rval;
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 3, 8, 3, 5};
        System.out.println(findAll(a, 3, 0));   // expect: [0, 2, 4]
        System.out.println(findAll(a, 7, 0));   // expect: [1]
        System.out.println(findAll(a, 9, 0));   // expect: []
        System.out.println( findAll(a, 5, 0));
    }
}