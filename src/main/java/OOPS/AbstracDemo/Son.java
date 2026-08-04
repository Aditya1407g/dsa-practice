package OOPS.AbstracDemo;

public class Son extends Parent{


    @Override
    void carrier(String name) {
        System.out.println(" I am an " + name);

    }

    @Override
    void partner(String name ,int age){

        System.out.println("i like " + name + " age is " + age);
    }


}
