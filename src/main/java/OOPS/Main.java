package OOPS;



public class Main {
    public static void main(String[] args) {
        Student  aditya = new Student(12, "aditya", 98.6f);
        Student unknown = new Student();

//        System.out.println(aditya.name);

        Singleton obj1 = Singleton.getInstanc();




    }

    static class Student{

        int roll;
        String name;
        float marks;

//         Student(){
//            this.roll = -1;
//            this.name= "Yet to register";
//            this.marks= -1;
//        }

        // calling constructor from other constructor
        Student(){
             this(13, "default", 100.0f);
        }

        Student(int roll , String  name, float marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }

    }
}
