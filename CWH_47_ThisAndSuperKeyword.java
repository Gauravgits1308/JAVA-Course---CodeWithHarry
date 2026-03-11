class Demo{
    private int num ;

    // Getter
    public int getNum(){
        return num ;
    }

    // Constructor
    Demo(int val){
        this.num = val ;
    }
}
public class CWH_47_ThisAndSuperKeyword {
    public static void main(String[] args) {
        Demo d = new Demo(23) ;
        System.out.println("Value is : "+d.getNum());
    }
}
/*
'this' Keyword in Java ==> 
    -> this is a reference variable that refers to the current object of the class.

    -> It is used inside a class to refer to the current class instance variables, methods, or constructors.

1️⃣ Refer Current Class Instance Variable
-> When instance variables and parameters have the same name, this is used to distinguish them.
class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " " + name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Gaurav");
        s1.display();
    }
}

2️⃣ Call Current Class Method
-> this can call another method of the same class.
class Demo {

    void display(){
        System.out.println("Hello");
    }

    void show(){
        this.display();
    }
}

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}

3️⃣ Call Another Constructor of Same Class
This is called constructor chaining.
class Demo {

    Demo(){
        this(10);
        System.out.println("Default constructor");
    }

    Demo(int x){
        System.out.println("Parameterized constructor: " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}

4️⃣ Pass Current Object as Argument
class Demo {

    void display(Demo obj){
        System.out.println("Method called");
    }

    void show(){
        display(this);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}

5️⃣ Return Current Object
class Demo {

    Demo getObject(){
        return this;
    }

    void display(){
        System.out.println("Returning current object");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.getObject().display();
    }
}

Important Rules

-> this refers to the current object of the class.
-> It is mainly used to avoid confusion between instance variables and parameters.
-> this() must be the first statement in a constructor.
-> It can call another constructor of the same class.

Difference between 'this' and 'super' keyword
 -> In Java, this and super are reference keywords used inside classes but they refer to different objects. The this keyword refers to the current class object and is used to access the current class’s variables, methods, or constructors, such as calling another constructor using this().
 
 -> On the other hand, the super keyword refers to the immediate parent class object and is used to access the parent class’s variables, methods, or constructors, such as calling a parent constructor using super(). In short, this is used within the same class, while super is used to access members of the parent class in inheritance.
*/
