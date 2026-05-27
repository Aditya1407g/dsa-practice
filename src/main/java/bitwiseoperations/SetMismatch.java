package bitwiseoperations;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(test1)));  // expected: [2, 3]

        int[] test2 = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(test2)));  // expected: [1, 2]

        int[] test3 = {3, 2, 3, 4, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(test3)));  // expected: [3, 1]
    }

    static int[] findErrorNums(int[] nums) {
        int xor =0;
        for(int x: nums){
            xor ^= x;
        }
        for(int i =1;i<nums.length+1;i++){
            xor^=i;
        }
        return new int[0];
    }
}
