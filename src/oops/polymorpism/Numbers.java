package oops.polymorpism;

public class Numbers {
    double sum(double a ,double b){
        System.out.println(a+b);
        return a+b;
    }
  int sum(int a,int b,int c){
        return a+b+c;
  }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(5.6,6);

    }
}
