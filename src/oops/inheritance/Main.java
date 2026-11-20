package oops.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(4.0,5.0,6.0);
//
//        Box box2=new Box(box);System.out.println(box2.l+ " "+box2.h+" "+box2.w);
//BoxWeight box3=new BoxWeight();
//        System.out.println(box3.h+" "+ box3.w+ " "+ box3.l+" "+ box3.weight);
//Box box5 =new BoxWeight(2,3,4,5);

//        System.out.println(box5.w);
//        System.out.println(box5.weight);
// there are many variblae s in parent and child classes
//        you are given access to that  are in ref type boxweigh
//        hence you should have access to weight varible
        // this also means that the ones u are trying to access should be intitalized
        // bure here when the obj itself is of type parent class, how will you call the constructor of child class
// this is error

//        BoxWeight box6 =new Box(2, 3 ,4 );


        //     super key word
//        BoxWeight box6= new BoxWeight(2,3,3,4);
//        System.out.println(box6.weight);
////        System.out.println(box.weight);
//
//BoxWeight box7=new BoxWeight(box6);



        Box box=new BoxWeight();
        Box.greeting();


        Box box2=new BoxWeight();
        Box.greeting();

    }



}
