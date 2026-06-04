package Recursion;
import java.util.Arrays;

public class FirstLastIndex {

    public static int firstIndex(int[] arr, int target, int index) {
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return firstIndex(arr, target, index+1);
    }

    public static int lastIndex(int[] arr, int target, int index) {
        if(index==arr.length) return -1;
        int cur = arr.length-index-1;
        if(arr[cur]==target) return cur;
        return lastIndex(arr,target,index+1);
    }

    public static int[] firstAndLast(int[] arr, int target) {
        return new int[]{ firstIndex(arr, target, 0), lastIndex(arr, target, 0) };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstAndLast(new int[]{3,7,3,8,3,5}, 3)));   // expect: [0, 4]
        System.out.println(Arrays.toString(firstAndLast(new int[]{1,2,3,4}, 3)));       // expect: [2, 2]
        System.out.println(Arrays.toString(firstAndLast(new int[]{1,2,3,4}, 9)));       // expect: [-1, -1]
        System.out.println(Arrays.toString(firstAndLast(new int[]{5,5,5}, 5)));         // expect: [0, 2]
    }
}