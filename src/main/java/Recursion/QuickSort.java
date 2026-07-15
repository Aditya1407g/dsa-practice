package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr , int low, int hi){

        if(low>=hi) return;
        int start = low;
        int end = hi;
        int pivot = arr[start+(end-start)/2];
        while(start<=end){
            while(arr[end]>pivot){
                end--;
            }
            while(arr[start]<pivot){
                start++;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, hi);
    }
}
