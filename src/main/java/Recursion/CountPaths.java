package Recursion;

public class CountPaths {

    public static int countWays(int n) {
        if(n==0) return 1;
        if(n<0) return 0;
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }

    public static void main(String[] args) {
        System.out.println(countWays(0));   // expect: 1  (one way: already there)
        System.out.println(countWays(1));   // expect: 1  (1)
        System.out.println(countWays(2));   // expect: 2  (1+1, 2)
        System.out.println(countWays(3));   // expect: 4  (1+1+1, 1+2, 2+1, 3)
        System.out.println(countWays(4));   // expect: 7
        System.out.println(countWays(5));   // expect: 13
    }
}