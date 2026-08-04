package OOPS.Access;

public class A {

    private int number ;
    private String name;
    private int[] arr;

    public int getNumber(){
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public A(int number, String name){
        this.number = number;
        this.name = name;
        this.arr= new int[number];
    }
}
