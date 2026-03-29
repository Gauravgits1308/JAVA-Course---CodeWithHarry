package StaticInJava;
class Demo {

    static void show() {
        System.out.println("Static Method");
    }

    // public static void main(String[] args) {
    //     show();
    // }
}
public class StaticMethod {
    public static void main(String[] args) {
        Demo.show(); // It can be called without creating an object, just with the help of class we can call an instance method.
}

}