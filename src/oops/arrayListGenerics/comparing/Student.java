package oops.arrayListGenerics.comparing;

public class Student implements Comparable<Student>{
    int rollNo;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
//        this.name = name;
        this.marks = marks;
    }

    String name;
    float marks;



    @Override
    public int compareTo(Student o) {
//        return 0;

    int diff= (int) (this.marks-o.marks);


return diff;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
