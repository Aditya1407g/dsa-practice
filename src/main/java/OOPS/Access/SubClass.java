package OOPS.Access;

public class SubClass extends A {

    public SubClass(int number , String name){
        super(number, name);
    }

    public static void main(String[] args) {
        A obj = new A(23, "Aditya");

        int n = obj.getNumber();
        System.out.println(n);
        obj.setNumber(55);
        n= obj.getNumber();
        System.out.println(n);
    }

}
