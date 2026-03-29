package StaticInJava;

class Animal4 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog4 extends Animal4 {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Upcasting {
    public static void main(String[] args) {

        Animal4 a = new Dog4();   // Upcasting
        a.sound();

    }
}
