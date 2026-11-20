package oops.abstractDemo;

public class Son extends Parent{
    @Override
    void career() {
        System.out.println("am going to be  a doctor");

    }

    @Override
    void partner() {
        System.out.println("i love pepper potts");

    }
    public Son(int age){
        super(age);
        this.age=age;
    }
}
