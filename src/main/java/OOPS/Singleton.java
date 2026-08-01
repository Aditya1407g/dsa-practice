package OOPS;

public class Singleton {

    private Singleton(){
        System.out.println("In single ton class");
    }

    private static Singleton instance;

    public static Singleton getInstanc(){

        if(instance==null){
            instance = new Singleton();
        }

        return instance;
    }


}
