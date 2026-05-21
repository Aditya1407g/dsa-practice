package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,9,11,16,22,24,28,36,45,48,50,52,53};
        int start=0;
        int end = arr.length;
        int target = 36;
        System.out.println("the element is found at index number"+ binarySearch(arr, target, start, end));

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        int ans=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = mid;
                return ans;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return ans;
    }
}
