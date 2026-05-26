package bitwiseoperations;
//lc 191

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));          // expected: 3   (binary 1011)
        System.out.println(hammingWeight(128));         // expected: 1   (binary 10000000)
        System.out.println(hammingWeight(2147483645));  // expected: 30
    }

    static int hammingWeight(int n) {
        int count =0;
        while( n>0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }
}
