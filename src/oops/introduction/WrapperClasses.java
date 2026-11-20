package oops.introduction;

public class WrapperClasses {
    public static void main(String[] args) {
//        int a = 10;
//        int b=20;
        Integer a = 10;
        Integer b = 20;
        // Integer is a final class you cannot modify content
        final int bonus = 20;
//        bonus=30; you cannot modify the final variable value;


        swap(a, b);
        System.out.println(a);
        System.out.println(b);
        Integer num = 45;
        A kunal =new A("kunal");
        System.out.println(kunal);


    }




    static void swap(int a, int b) {
        Integer temp = a;
        a = b;
        b = temp;

    }

}
class A{
    final int num=10;
    String name;

    public A(String name) {

        this.name = name;
    }}


