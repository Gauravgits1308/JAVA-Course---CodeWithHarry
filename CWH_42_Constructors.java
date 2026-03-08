class Job{
    private int JobID ;
    private String JobName ;
    String desc ;
    float duration ;

    // Constructor
    public Job(int ID, String name, String desc, float duration){
        this.JobID = ID ;
        this.JobName = name ;
        this.desc = desc ;
        this.duration = duration ;
    }

    // Constructor Overloading 
    public Job(){
        JobID = 202 ;
    }

    // Getter Methods
    public int getJobID(){
        return JobID;
    }

    public String JobName(){
        return JobName;
    }
}
public class CWH_42_Constructors {
    public static void main(String[] args) {
        Job j1 = new Job(101,"Gaurav","Software",2.50f);
        System.out.println(j1.getJobID());
        System.out.println(j1.JobName());
        System.out.println(j1.desc);
        System.out.println(j1.duration);
    }
}
/*
Constructor in Java ==> 
A constructor in Java is a special method used to initialize objects of a class. It is automatically called when an object is created.

Key Characteristics ==> 
Name must be the same as the class name
No return type (not even void)
Automatically called when object is created
Used to initialize object properties (variables)

Types of Constructors in Java ==>
1. Default Constructor
A constructor with no parameters.
If you do not write any constructor, Java automatically provides a default constructor.
Example: 
class Student{
    int id;
    String name;

    Student(){
        id = 0;
        name = "Unknown";
    }
}

2. Parameterized Constructor
A constructor that accepts parameters to initialize object variables.
Example: 
class Student{
    int id;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }
}

3. Copy Constructor (User-defined)
Java does not provide a built-in copy constructor like C++, but we can create one manually to copy values from another object.
Example:
class Student{
    int id;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }

    Student(Student s){
        id = s.id;
        name = s.name;
    }
}

Student s1 = new Student(101, "Gaurav");
Student s2 = new Student(s1);

*/
