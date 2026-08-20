package StackAndQueue;

public class CustomStack {


    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=-1;


    public CustomStack(){
        this.data= new int[DEFAULT_SIZE];
    }
    public CustomStack(int size){
        this.data = new int[size];
    }


}
