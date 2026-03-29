abstract class Shape {

    abstract int area(int l, int b);

}

class Circle extends Shape {

    int area(int l,int b){
        return l*b;
    }

}

public class CWH_53_AbstractClassAndMethod {
    public static void main(String[] args){

        Circle obj = new Circle();
        obj.area(2,3);
        System.out.println("Area is : "+obj.area(2, 3));

    }
}
