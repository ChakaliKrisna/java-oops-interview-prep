package oops.inheritance;

public class BoxWeight extends Box{
    double weight ;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double length,double height, double w, double weight){
        super(length,height,w);// what is this ? call the parent class constructor

//        super.weight=25;
//        this.weight =50;
//        System.out.println(super.weight);
        this.weight=weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight=weight;
        System.out.println("box weight constructor called");
    }
    static void greeting(){
        System.out.println("am in boxweight class ");

    }
}
