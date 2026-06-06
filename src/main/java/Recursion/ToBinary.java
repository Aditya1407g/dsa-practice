package Recursion;

public class ToBinary {

    public static String toBinary(int n) {
        if(n/2==0 && n%2==0) return "0";
        if(n/2==0)  return "1";
        if(n%2==0){
            return toBinary(n/2)+"0";
        }
        return toBinary(n/2)+"1";

    }

    public static void main(String[] args) {
        System.out.println(toBinary(0));    // expect: 0
        System.out.println(toBinary(1));    // expect: 1
        System.out.println(toBinary(2));    // expect: 10
        System.out.println(toBinary(5));    // expect: 101
        System.out.println(toBinary(13));   // expect: 1101
        System.out.println(toBinary(255));  // expect: 11111111
    }
}