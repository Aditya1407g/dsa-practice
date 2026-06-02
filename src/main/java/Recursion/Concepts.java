package Recursion;

public class Concepts {
    public static void main(String[] args) {
        call(5);
    }
    static void call(int n){
        if(n==0) return;

        System.out.println("hello");
        n--;
        call(n);
    }
}
