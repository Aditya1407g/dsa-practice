package Recursion;


public class LinearSearch {

    public static int search(int[] arr, int target, int index) {
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return search(arr,target,index+1);
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 2, 8, 5};
        System.out.println(search(a, 8, 0));    // expect: 3
        System.out.println(search(a, 3, 0));    // expect: 0  (first element)
        System.out.println(search(a, 99, 0));   // expect: -1 (not present)

        int[] b = {4, 1, 4, 9};
        System.out.println(search(b, 4, 0));    // expect: 0  (first occurrence, not 2)
    }
}