package Recursion;

public class DigitalRoot {

    public static int digitalRoot(int n) {
        if(n/10==0) return n;
        int now = n%10;
        now += digitalRoot(n/10);
        return digitalRoot(now);
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(493193));   // expect: 2
        System.out.println(digitalRoot(0));         // expect: 0
        System.out.println(digitalRoot(9));         // expect: 9
        System.out.println(digitalRoot(38));        // expect: 2  (3+8=11 -> 1+1=2)
        System.out.println(digitalRoot(100));       // expect: 1
    }
}