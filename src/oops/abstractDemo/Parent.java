package oops.abstractDemo;

public abstract class Parent {
    abstract  void career();
    abstract  void partner();
        final int Value;
    public Parent(int age) {
        this.age = age;
        Value=1235;
//        Value = 5656655;
//        value=1234;
    }

    int age=60;

     public static void hello(){
        System.out.println("hello in parent class");
    }
    public  void greeting(){
        System.out.println("hello am greeting");
    }

}
