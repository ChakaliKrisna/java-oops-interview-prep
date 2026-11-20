package oops.access_control;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj =new A(+14,"Krisha");
        System.out.println(obj.num);
    }
}
