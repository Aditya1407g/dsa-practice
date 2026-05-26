package bitwiseoperations;
//lc136
public class SingleNumber {
    public static void main(String[] args) {
        int[] test1 = {2, 2, 1};
        System.out.println(singleNumber(test1));  // expected: 1

        int[] test2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(test2));  // expected: 4

        int[] test3 = {1};
        System.out.println(singleNumber(test3));  // expected: 1
    }

    static int singleNumber(int[] nums) {
        int sum=0;
        for(int x: nums){
            sum= sum^x;
        }
        return sum;
    }
}
