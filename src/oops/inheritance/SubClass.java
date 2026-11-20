package oops.inheritance;

import oops.access_control.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass  obj =new SubClass(+14,"Krisha");
        System.out.println(obj.num);
    }
}
