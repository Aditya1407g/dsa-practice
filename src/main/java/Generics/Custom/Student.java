package Generics.Custom;

public class Student implements Comparable<Student>{

    int rollno;
    int marks;


    public Student(int rollno, int marks){
        this.marks=marks;
        this.rollno=rollno;
    }


    @Override
    public int compareTo(Student o) {
        int diff =(int) (this.marks-o.marks);
        return diff;
    }
}
