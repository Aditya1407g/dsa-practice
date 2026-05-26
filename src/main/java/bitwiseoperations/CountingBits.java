package bitwiseoperations;

//lc338
import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));  // expected: [0, 1, 1]
        System.out.println(Arrays.toString(countBits(5)));  // expected: [0, 1, 1, 2, 1, 2]
        System.out.println(Arrays.toString(countBits(0)));  // expected: [0]
    }

    static int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i =1;i<=n;i++){
            ans[i]= ans[i>>1] + (i&1);
        }
        return ans;
    }
}
