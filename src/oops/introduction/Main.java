package oops.introduction;

public class Main {
    public static void main(String[] args) {
        // store roll numbers
        int[] numbers = new int[5];
        // store five names
        String[] names = new String[5];
        // data of five student {roll no, name,marks}

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        // some data str
//        Arrays.toString(numbers);
//        System.out.println(Arrays.toString(names));


        Student student1 = new Student(57, "student1", 68.5f);
//student() constructor
//        student1.rno=55;
//        student1.name="kunal";
//        student1.marks=66.5f;
        Student rahul = new Student(58, "rahul", 89.6f);

        System.out.println(student1.marks);

        System.out.println(student1.rno);
        System.out.println(student1.name);
//        Main.greeting(rahul);
//rahul.greeting();
//
//rahul.changeName("hari");
//        rahul.greeting();


        Student random = new Student(rahul);
        System.out.println(random.name);
        Student random2=new Student();
        System.out.println(random2.name);
        System.out.println(random2.rno);



        Student one=new Student();
        Student two=one;

        one.name="something  somethisng";
        System.out.println(two.name);
    }


}

    // create a class
// for every student
    class Student {

        int rno;
        String name;
        float marks;


        // we need a way to add values of above properties obj by obj
        // we need one word to access every obj;


Student(){
    // this is how you call a constructor from another constructor;
//    internally  it is Student(13,"student",96.2f)
    this(55,"student1",96.2f);

}
//this will replaced with
        Student(int rollno,String name,float marks){

//            kunal.rno=13;
//            kunal.name="kunal";
            this.marks=marks;
            this.name=name;
            this.rno=rollno;


        }
        void changeName(String NewName){
            System.out.println(this.name);
            this.name=NewName;
        }
        void greeting(){
            System.out.println("my name is "+this.name);
        }
        Student(Student other){
    this.name=other.name;
    this.rno=other.rno;
    this.marks=other.marks;


        }

    }

