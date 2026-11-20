package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car=new Car();
//        car.acc();
//        car.start();
//        car.stop();



//        Media carMedia=new Car() ;
//        carMedia.start();
        NiceCar nicecar=new NiceCar();
        nicecar.start();
        nicecar.stopMusic();
        nicecar.upgradeEngine();
        nicecar.start();
    }
}
