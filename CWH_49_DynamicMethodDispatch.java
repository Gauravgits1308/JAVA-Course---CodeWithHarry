class Animal1{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Lion1 extends Animal1{
    @Override
    public void sound(){
        System.out.println("Lion barks");
    }
}

public class CWH_49_DynamicMethodDispatch{
    public static void main(String[] args){
        Animal1 a = new Lion1();   // parent reference, child object
        a.sound();
    }
}
/*
Dynamic Method Dispatch (Runtime Polymorphism) in Java
Dynamic Method Dispatch is the mechanism by which a call to an overridden method is resolved at runtime rather than compile time.

In simple words:
-> A parent class reference can refer to a child class object, and the method of the child class runs.
-> This happens because of method overriding.

synatx => Parent reference = new Child();

Example => 
    class Animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}

public class DynamicDispatch{
    public static void main(String[] args){
        Animal a = new Dog();   // parent reference, child object
        a.sound();
    }
}

IMPORTANT POINTS => 
-> Only overridden methods are dispatched dynamically.
-> Variables are not dynamically dispatched.
-> Happens when method overriding exists
-> Parent reference → Child object
-> Method decided at runtime
-> Provides runtime polymorphism
*/