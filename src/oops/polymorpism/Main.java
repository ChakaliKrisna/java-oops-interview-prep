package oops.polymorpism;

public class Main {


    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        Circle circle =new Circle();
//        Shapes square =new S();

        shapes.area();
        circle.area();
//        square.area();
//        System.out.println(square);

        System.out.println(shapes.side);
    }
}
