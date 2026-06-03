package Recursion;

public class CountOccurrences {
    public static int count(int[] arr, int target, int index) {
        if(index==arr.length) return 0;
        int here =0;
        if(arr[index]==target) here =1;
        return here+count(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 3, 8, 3, 5};
        System.out.println(count(a, 3, 0));    // expect: 3
        System.out.println(count(a, 7, 0));    // expect: 1
        System.out.println(count(a, 99, 0));   // expect: 0
        System.out.println(count(new int[]{}, 5, 0));  // expect: 0
    }
}