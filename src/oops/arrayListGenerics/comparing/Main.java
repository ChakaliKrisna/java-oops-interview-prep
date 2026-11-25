package oops.arrayListGenerics.comparing;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Student kunal=new Student(16,56.f);
        Student rahul=new Student(15,67.8f);
        Student arpit=new Student(14,88.8f);
        Student karan=new Student(13,84.8f);
        Student sachin=new Student(12,96.8f);
//        System.out.println(kunal.compareTo(rahul));


        Student[] list=new Student[]{kunal,rahul,arpit,karan,sachin};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(list);

    }
}
