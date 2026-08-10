package Generics.Custom;

public class Main {

    public static void main(String[] args) {

        Student aditya = new Student(23, 88);
        Student kunal = new Student(43, 40);
        Student karthik = new Student(73, 78);
        Student kushwaha = new Student(83, 888);
        Student prasad = new Student(29, 8208);
        Student kiran = new Student(63, 8758);


        System.out.println((aditya.compareTo(kunal)));
    }



}
