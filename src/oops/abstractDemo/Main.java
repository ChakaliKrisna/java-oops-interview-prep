package oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();

        Daughter daughter = new Daughter(21);
        daughter.career();
//        Parent parent=new Parent(25);

        System.out.println(son.age);
//        System.out.println(parent.age);

//        Parent parent=new Parent();

        Parent.hello();


    }
}