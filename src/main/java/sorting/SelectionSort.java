package sorting;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int localMin = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[localMin]>arr[j]){
                    localMin=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[localMin];
            arr[localMin]=temp;
        }
    }
}
