package Recursion;

public class ArraySum {

    public static int sum(int[] arr, int index) {
        if(index==arr.length) return 0;
        return arr[index]+sum(arr,index+1);
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 2, 8, 5};
        System.out.println(sum(a, 0));   // expect: 25

        int[] b = {10};
        System.out.println(sum(b, 0));   // expect: 10

        int[] c = {};
        System.out.println(sum(c, 0));   // expect: 0
    }
}
