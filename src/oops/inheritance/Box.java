package oops.inheritance;

public class Box {


    double l;
    double h;
    double w;
//    double weight;
    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }
//    cube

    Box(double side){
//        super(); object class
        this.l=side;
        this.h=side;
        System.out.println("box constructor called");
        this.w=side;
//        this.l=-1;


    }
    Box(double l,double h,double w){

        System.out.println("Box class constructor");this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
        System.out.println("box constructor called with box weight obj");


    }
    Box(BoxWeight Boxweight){
        System.out.println("box constructor called with box weight obj2 ");
    }
    public void information(){
        System.out.println("running the box");
    }





//@Override not actually overriding
    static void greeting(){
      System.out.println("am in box.. ");

  }


}
