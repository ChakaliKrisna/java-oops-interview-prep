package oops.packages.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal=new Human(22,"kurnal",1000,false );
//        Human rahul=new Human(22,"rahul",2000,true );
//
//        System.out.println(kunal.name);
// what if there was some sort of property common to all all human;
        //population
        System.out.println(Human.population);
        System.out.println(Human.population);
//        Main main=new Main();
//        main.greeting();
//        greeting()

        fun();
//        ;
           
    }
    // it is not dependent on obj
    static void fun(){

//        greeting();// you cant use this because it requires an instance
//but the function you are using it does not dependent on instances

//  you cannont access not static stuff without refferenceing their instances in a static concext;

  Main obj =new Main();
  obj.greeting();





    }
    // we know something which is not static belongs to an obj
    void greeting(){
//        fun();
        System.out.println("hello world");
    }

    void fun2(){
        // we can call non-static method in side a non static method because at the end
//         the obj for the fun2 definitely created so that obj through that obj other non static method accessed
        greeting();
    }
}
