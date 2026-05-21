package sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {0,1};
        int a = missingNumber(arr);
        System.out.println(a);

    }
    static  int missingNumber(int[] nums) {
        int max= nums.length;
        int i =0;
        while(i<nums.length){
            if(nums[i]!=i){
                if(nums[i]==max){
                    i++;
                }
                else{
                    int temp= nums[i];
                    nums[i]=nums[temp];
                    nums[temp]=temp;
                }

            }
            else i++;
        }
        int rval = max;
        for(int j =0;j<nums.length;j++) {
            if (nums[j] != j) {
                rval = j;
                break;
            }

        }
        return rval;

    }
}
