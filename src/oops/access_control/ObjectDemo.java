package oops.access_control;

public class ObjectDemo {

    int num;
    float gpa;
    public ObjectDemo(int num,float gpa){
        this.num=num;
        this.gpa=gpa;
    }
// we will go in details of how to create
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(25,8.9f);
        ObjectDemo obj2=new ObjectDemo(25,8.9f);
//        ObjectDemo obj2=new ObjectDemo(34);
//        ObjectDemo obj2;
//        obj2 = obj;
//        System.out.println(obj.hashCode(\);
//        System.out.println(obj2.hashCode());
if(obj==obj2){
    System.out.println("obj , obj 2 are equal");
}
if(obj.equals(obj2)){
    System.out.println("obj and obj2 both are equal");
}


    }
// == chceks ref obj and obj2 pointing to same obj
//    equals checks content in it
}
