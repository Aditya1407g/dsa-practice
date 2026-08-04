package OOPS;

import OOPS.Access.A;

public class Singleton{




    private static Singleton instance;

    public static Singleton getInstanc(){

        if(instance==null){
            instance = new Singleton();
        }

        return instance;
    }


    A obj = new A(23, "aditya");



}
