package sorting;

public class SortColors {

    public void sortColors(int[] nums) {
        int start=0, mid=0, end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,start, mid);
                start++;
                mid++;
            }
            else if(nums[mid]==1) mid++;
            else {
                swap(nums, mid , end);
                end--;
            }
        }
    }
    static void swap(int[] nums, int  a, int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }

    public static void main(String[] args) {
        SortColors sol = new SortColors();

        int[] a = {2, 0, 2, 1, 1, 0};
        sol.sortColors(a);
        System.out.println(java.util.Arrays.toString(a));   // expect: [0, 0, 1, 1, 2, 2]

        int[] b = {2, 0, 1};
        sol.sortColors(b);
        System.out.println(java.util.Arrays.toString(b));   // expect: [0, 1, 2]

        int[] c = {0};
        sol.sortColors(c);
        System.out.println(java.util.Arrays.toString(c));   // expect: [0]

        int[] d = {2, 2, 1, 1, 0, 0};
        sol.sortColors(d);
        System.out.println(java.util.Arrays.toString(d));   // expect: [0, 0, 1, 1, 2, 2]
    }
}