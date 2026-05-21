package searching;
//here we will not use arr.length method to get the length of array
public class InfifniteArray{
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9,10,11,12,15,20,23,30,40,50,60,70,80,90,110,120};
        int target = 15;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int start=0 , end =1;
        while(arr[end]<target){
            start=end;
            end=end*2;
        }
        return binarySearch(arr,target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<target) start=mid+1;
            else if (arr[mid]>target) end=mid-1;
            else return mid;
        }
        return -1;
    }
}
