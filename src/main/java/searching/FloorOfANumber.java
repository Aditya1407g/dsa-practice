package searching;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(floor(arr, target));

    }

    static int floor(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return arr[mid];
            if(arr[mid]<target) start= mid+1;
            else end = mid-1;
        }
        if(end>=0) return arr[end];
        return -1;

    }
}
