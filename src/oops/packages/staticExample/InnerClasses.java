package oops.packages.staticExample;

public class InnerClasses {

 static class Test {
    public Test(String name) {
        this.name = name;
    }

    String name;
    @Override
    public String toString(){
        return name;

    }


}

// this test class is where it is mentioned as static ??
//    in the inner class so hence it does not requiered inner class obj to run
//    it is not dependent on the obj of the Innerclasses class


    public static void main(String[] args) {
        Test a=new Test("kunal");
        Test b=new Test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);

    }


}
