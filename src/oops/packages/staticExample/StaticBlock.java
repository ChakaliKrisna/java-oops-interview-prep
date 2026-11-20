package oops.packages.staticExample;

// this is a demo to show initialization of static varibles
public class StaticBlock {


    static int a=4;
    static int b;



    static {
        System.out.println("am in static block  ");
b=a*5;
// will only run once when the first obj created
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+" "+StaticBlock.b);

StaticBlock.b+=3;
StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);


    }
}
