package Recursion;

import java.util.ArrayList;

public class FindAllIndices {

    public static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        return findAll(arr, target, index+1, list);
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 3, 8, 3, 5};
        System.out.println(findAll(a, 3, 0, new ArrayList<>()));   // expect: [0, 2, 4]
        System.out.println(findAll(a, 7, 0, new ArrayList<>()));   // expect: [1]
        System.out.println(findAll(a, 9, 0, new ArrayList<>()));   // expect: []
    }
}