package Recursion;

public class ClimbingStairs {
    static int count =0;
    public int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        if(n<0) return 0;
        return  climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        ClimbingStairs sol = new ClimbingStairs();
        System.out.println(sol.climbStairs(2));   // expect: 2
        System.out.println(sol.climbStairs(3));   // expect: 3
        System.out.println(sol.climbStairs(4));   // expect: 5
    }
}