class Employee{
        int ID ;
        String name ;
        int age ;
        int salary ;
        boolean IsIndian ;

        public void greet(){
            System.out.println("Hello "+name+"! \nAre you an Indian : "+IsIndian);
        }

        public int displaySalary(){
            return salary ;
        }
    }

public class CWH_38_OwnJavaClass {
    public static void main(String[] args) {
        Employee Gaurav = new Employee(); // Instantiationg an object of class 'Employee'

        // Setting Attributes of an Object of Employee Class
        Gaurav.ID = 101 ;
        Gaurav.name = "Gaurav Gupta" ;
        Gaurav.IsIndian = true ;
        Gaurav.age = 21 ;
        Gaurav.salary = 2000000 ;
        Gaurav.greet();
        System.out.println("The Salary of Gaurav is : "+Gaurav.displaySalary());


    }
}
/*
Note :- One java file can have only one public class.
 */
