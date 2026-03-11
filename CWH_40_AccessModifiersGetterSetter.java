class Student1{
    int ID ;
    String name ;
    private int age;

    // Setter Method
    public void setAge(int age){
        if(age > 0) // validation
            this.age = age ;
    }

    // Getter Method
    public int getAge(){
        return age ;
    }
}
public class CWH_40_AccessModifiersGetterSetter {
    public static void main(String[] args) {
        Student1 stud1 = new Student1();
        stud1.ID = 101 ;
        stud1.name = "Kunj Gupta";
        stud1.setAge(-3); // Setter Method will prevent this behaviour and default value will be assigned to age attribute 
        stud1.setAge(10); // Works Fine

        System.out.println(stud1.ID);
        System.out.println(stud1.name);
        System.out.println(stud1.getAge());
    }
}
/*
Access Modifiers in Java ==> 
Access Modifiers control who can access variables, methods, or classes.
Java has 4 access modifiers.
-> private → accessible only inside the same class
-> default → accessible inside the same package
-> protected → accessible in same package + subclasses
-> public → accessible everywhere

Modifier	Same Class	Same Package	Subclass	Other Package
private	        ✅	        ❌	          ❌            ❌
default     	✅	        ✅	          ❌            ❌
protected	    ✅	        ✅	          ✅	           ❌
public	        ✅	        ✅	          ✅	           ✅

Why Getters and Setters are Used ==> 
    In OOP, variables are usually made private to protect data.
    To access or modify them, we use Getter and Setter methods.
        This concept is called Encapsulation.

Getter Method
A getter is used to read the value of a private variable.
Syntax: 
public datatype getVariableName(){
    return variable;
}
Example: 
public int getSalary(){
    return salary;
}

Setter Method
A setter is used to modify/update the value of a private variable.
Syntax: 
public void setVariableName(datatype value){
    variable = value;
}
Example: 
public void setSalary(int s){
    salary = s;
}

Complete Example of Getter and Setter ==> 
class Employee {

    private int salary;

    // Getter Method
    public int getSalary(){
        return salary;
    }

    Setter Method
    public void setSalary(int s){
        salary = s;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setSalary(50000);
        System.out.println(e1.getSalary());
    }
}
*/