package oops.arrayListGenerics;

import oops.polymorpism.Numbers;

import java.util.Arrays;

public class CustomArrayList< T  extends Number> {

    Object[] data;
    int size=0;
    static int DEFAULT_SIZE=10;
public CustomArrayList(){
     data  = new Object[DEFAULT_SIZE];
}


     public <T> void add(T num){
         if(isfull()){
             Object[] temp=new Object[2*data.length];
             for(int i=0;i<data.length;i++){
                 temp[i]=data[i];
             }
             data=temp;

         }
         data[size++]=num;
     }
     public T remove(){
        T removed= (T)(data[--size]);
//        size--;
        return removed;
     }

    private boolean isfull() {
        return data.length==size;
    }

    public int size(){
    return size();
    }
    public T get(int index){
    return (T)data[index];
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList<Integer> customArrayListArrayList=new CustomArrayList<>();
//        customArrayListArrayList.add(5);
        System.out.println(customArrayListArrayList.get(0));
        for(int i=0;i<5;i++){
            customArrayListArrayList.add(i);
//            customArrayListArrayList.add(6.2);
//            customArrayListArrayList.add("krishna");
        }
        System.out.println(customArrayListArrayList.toString());

    }



}
