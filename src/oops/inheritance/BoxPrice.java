package oops.inheritance;

public class BoxPrice extends BoxWeight {


    double cost;
    BoxPrice(){
        super();
        this.cost=-1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    public BoxPrice(double length, double height, double w, double weight, double cost) {
        super(length, height, w, weight);
        this.cost = cost;
    }
    public BoxPrice(double side ,double weight, double cost) {

        super(side, weight);
        System.out.println("box price constructor called");
        this.cost = cost;
    }



}
