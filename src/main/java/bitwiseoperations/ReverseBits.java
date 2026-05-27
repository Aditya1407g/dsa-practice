package bitwiseoperations;


public class ReverseBits {
    public static void main(String[] args) {
        // Note: Java has signed ints. For testing, we pass int and read int.
        // LeetCode uses unsigned semantics but Java handles bits the same way.

        System.out.println(reverseBits(43261596));  // expected: 964176192
        System.out.println(reverseBits(-3));         // expected: -1073741825
        // (-3 = 11111111111111111111111111111101)
    }

    static int reverseBits(int n) {
        int rval =0;
        for(int i =0;i<32;i++){
            rval = rval<<1;
            int temp = n&1;
            rval = rval|temp;
            n= n>>>1;
        }
        return rval;
    }
}