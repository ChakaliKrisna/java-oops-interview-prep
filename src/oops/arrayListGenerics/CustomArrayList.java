package oops.arrayListGenerics;

import java.util.Arrays;

public class CustomArrayList {

    int[] data;
    int size=0;
    static int DEFAULT_SIZE=10;
public CustomArrayList(){
     data  = new int[DEFAULT_SIZE];
}


     public void add(int num){
         if(isfull()){
             int[] temp=new int[2*data.length];
             for(int i=0;i<data.length;i++){
                 temp[i]=data[i];
             }
             data=temp;

         }
         data[size++]=num;
     }
     public int remove(){
        int removed=data[--size];
//        size--;
        return removed;
     }

    private boolean isfull() {
        return data.length==size;
    }

    public int size(){
    return size();
    }
    public int get(int index){
    return data[index];
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList customArrayListArrayList=new CustomArrayList();
//        customArrayListArrayList.add(5);
        System.out.println(customArrayListArrayList.get(0));
        for(int i=0;i<5;i++){
            customArrayListArrayList.add(i);
        }
        System.out.println(customArrayListArrayList.toString());

    }



}
