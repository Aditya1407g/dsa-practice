package Maths;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(35));
    }
    static int sqrt(int n){
        int start=1 , end = n/2;
        while(start<=end){
            int mid = start+(end-start)/2;
            int ele = mid*mid;
            if(ele==n) return mid;
            else if(ele>n) end = mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
