package Recursion;

public class PrintNumbers {

    // Print N down to 1
    static void printNtoOne(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNtoOne(n-1);
    }

    // Print 1 up to N
    static void printOneToN(int n) {
        if(n==0) return;
        printOneToN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.print("N to 1 (n=5): ");
        printNtoOne(5);    // expect: 5 4 3 2 1

        System.out.print("\n1 to N (n=5): ");
        printOneToN(5);    // expect: 1 2 3 4 5
    }
}