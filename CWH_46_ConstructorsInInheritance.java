class Base1{
    int num ;
    
    // Constructor
    Base1(){
        System.out.println("I am base1 constructor");
    }

    // Constructor Overloading 
    Base1(int value){
        System.out.println("I am overloaded const. and value is : " +value);
    }
}

class Derived1 extends Base1{
    int num ;

    Derived1(){
        System.out.println("I am default constructor of Derived1 Class");
    }
    // Constructor
    Derived1(int x,int y){
        super(10); // 'super' keyword is used to run the constructor with parameter values
        System.out.println("I am derived1 Constructor with sum of x and y is : "+(x+y));
    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am ChildOfDerived1 Construcor");
    }

    ChildOfDerived1(int a,int b, int c){
        System.out.println("a+b+c = "+(a+b+c));
    }
}

public class CWH_46_ConstructorsInInheritance {
    public static void main(String[] args) {
        // Constructor gets invoked as soon as we create an object...
        // Base1 b = new Base1() ;

        // Derived1 d = new Derived1(2,3) ; // passing the argument for parameters in its constructor 

        ChildOfDerived1 cd = new ChildOfDerived1();

    }
}
/*
Constructors in Inheritance (Java)

In Java inheritance, when a child class object is created, the constructor of the parent class is executed first, followed by the constructor of the child class.

This happens because the child class inherits properties from the parent, so the parent part must be initialized first.

Important Rules
-> Parent constructor always executes first.
-> super() is used to call the parent constructor.
-> super() must be the first statement in the child constructor.
-> If you do not write super(), Java automatically calls the default constructor of the parent.
-> If the parent does not have a default constructor, you must explicitly call a parameterized constructor using super().

'super' Keyword in Java
Definition : super is a reference variable in Java that refers to the immediate parent (superclass) object.
It is used in a subclass to access members (variables, methods, and constructors) of the parent class.

Important Rules of super
-> super refers to the immediate parent class object.
-> super() must be the first statement in a constructor.
-> If you do not write super(), Java automatically calls the parent’s default constructor.
-> super can be used to access:
    Parent variables
    Parent methods
    Parent constructors
-> super cannot access private members of the parent class.
 */