package oops.arrayListGenerics;

import jdk.dynalink.Operation;
import oops.access_control.A;

import java.util.ArrayList;
import java.util.function.Consumer;

//import static oops.packages.staticExample.StaticBlock.b;

public class LamdaFunctions {
    public static void main(String[] args) {
//        int[] arr={3,4,52,1};
        ArrayList<Integer> arr =
                new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        Consumer<Integer> consumer = (item) -> System.out.println(item);
//        consumer.accept(arr);
        arr.forEach(consumer);
LamdaFunctions lamdaFunctions=new LamdaFunctions();


//        operation sum = new operation() {
//            @Override
//            public int operation(int a, int b) {
//                return a+b;
//            }
//        }; is same as the
        Operation sum = (a, b) -> {
            return a + b;
        };
        Operation product = (a, b) -> a * b;


    System.out.println( lamdaFunctions.operate(5,2,sum));


    }
    int operate(int a, int b, Operation op){
        return op.operation(a,b);


    }







    public interface Operation{
        int operation(int a,int b);

    }
}

