package Generics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {

    private  Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public CustomArrayList(){
        data = new Object[DEFAULT_SIZE];
    }


    public void add(T num){
        if(isFull()){
            reSize();
        }
        this.data[size++]=num;
    }

    private void reSize(){
        Object[] temp = new Object[data.length*2];

        for(int i =0;i<data.length;i++){
            temp[i]=data[i];
        }

        data = temp;
    }

    public T remove(){
        return (T) (data[--size]);
    }

    public T get(int index){
        return (T) data[index];
    }
    public int size() {
        return size;
    }

    public void set(int index, T value){
        data[index]=value;
    }

    private boolean isFull(){
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

    }
}
