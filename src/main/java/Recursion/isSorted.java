package Recursion;

public class isSorted {

    public static boolean isSorted(int[] arr, int index) {
        if(index== arr.length-1 || arr.length==0) return true;
        if(arr[index]>arr[index+1]) return false;
        return isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(isSorted(a, 0));   // expect: true

        int[] b = {1, 3, 2, 4};
        System.out.println(isSorted(b, 0));   // expect: false

        int[] c = {5};
        System.out.println(isSorted(c, 0));   // expect: true

        int[] d = {2, 2, 2};
        System.out.println(isSorted(d, 0));   // expect: true

        int[] e = {1,2,5,3};
        System.out.println(isSorted(e,0));
    }
}
