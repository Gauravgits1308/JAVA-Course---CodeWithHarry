class Animal {
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.eat();   // inherited method
        d1.bark();  // own method
    }
}
/*
Inheritance in Java

-> Inheritance is an OOP concept where one class acquires the properties and methods of another class.
-> The class that gives properties → Parent / Superclass / Base class
-> The class that inherits properties → Child / Subclass / Derived class
-> It helps in code reusability and method extension.
->In Java, inheritance is implemented using the 'extends' keyword.

SYNTAX ==>
class ParentClass {
    // properties and methods
}

class ChildClass extends ParentClass {
    // additional properties and methods
}

EXAMPLE ==> 
class Animal {
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class TestInheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();   // inherited method
        d1.bark();  // own method
    }
}

TYPES OF INHERITANCE IN JAVA ==> 
1. Single Inheritance
    One child class inherits from one parent class.
    A → B
    class A{
        void show(){
            System.out.println("Class A");
        }
    }

    class B extends A{
        void display(){
            System.out.println("Class B");
        }
    }

2. Multilevel Inheritance
    A class inherits from a class that already inherited another class.
    A → B → C
    class A{
        void show(){
            System.out.println("Class A");
        }
    }

    class B extends A{
        void display(){
            System.out.println("Class B");
        }
    }

    class C extends B{
        void print(){
            System.out.println("Class C");
        }
    }

3. Hierarchical Inheritance
    Multiple classes inherit from one parent class.
        A
        / \
        B   C
    class A{
        void show(){
            System.out.println("Class A");
        }
    }

    class B extends A{
        void display(){
            System.out.println("Class B");
        }
    }

    class C extends A{
        void print(){
            System.out.println("Class C");
        }
    }

4. Multiple Inheritance (Not Supported with Classes)
    Java does not support multiple inheritance with classes to avoid ambiguity problem (Diamond Problem).
    A
    | \
    B  C
    \ |
    D
    But it can be achieved using interfaces.

Advantages of Inheritance
-> Code Reusability
-> Reduces code duplication
-> Improves maintainability
-> Supports method overriding
-> Helps implement hierarchical classification
*/
