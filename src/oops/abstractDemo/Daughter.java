package oops.abstractDemo;

public class Daughter extends  Parent {
    @Override
    void career() {
        System.out.println("am going to be a coder");

    }

    @Override
    void partner() {
        System.out.println("i love iron man");

    }
    Daughter(int age){
        this.age=age;
    }
}
