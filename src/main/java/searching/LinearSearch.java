package searching;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {58,27,16,225,51,23,59,57,22,8,5};
        System.out.println(linearSearch(nums,57));
        System.out.println(linearSearch(nums,99));
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0) return -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target)  return i;
        }
        return -1;
    }
}
