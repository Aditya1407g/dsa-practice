package Recursion;

public class FindMax {

    public static int max(int[] arr, int index) {
        if(index==arr.length-1) return arr[index];
        return Math.max(arr[index],max(arr,index+1));
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 2, 8, 5};
        System.out.println(max(a, 0));    // expect: 8

        int[] b = {-4, -1, -9, -2};
        System.out.println(max(b, 0));    // expect: -1

        int[] c = {42};
        System.out.println(max(c, 0));    // expect: 42
    }
}