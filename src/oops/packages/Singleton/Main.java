package oops.packages.Singleton;

import oops.access_control.A;

public class Main extends A{


    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        Singleton singleton=new Singleton();
        Singleton obj =Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        // two obj points to one obj



        A a=new A(14,"krisna");
//        System.out.println(a.num);


    }
}
