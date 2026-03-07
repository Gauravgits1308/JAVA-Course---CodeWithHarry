
public class CWH_31_MethodOverloading {
    
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b){
        return a + b;
    }

    static void changeArray(int[] arr){
        arr[0] = 34 ;
    }

    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2.5,3.5));
        
        // IMPORTANT CONCEPT : When an array is passed to a method, the method receives a reference to the same array, so changes inside the method affect the original array.In case of arrays, the reference is passed, same is the case for Object passing to Methods. 
        int[] marks = {23,4,5,54,55,67,23} ;
        System.out.println("Value of marks[0] before calling changeArray : "+marks[0]);
        changeArray(marks) ;
        System.out.println("Value of marks[0] after calling changeArray : "+marks[0]); // Value will get changed


    }
}
/*
Method Overloading in Java...
Method Overloading means having multiple methods with the same name but different parameters in the same class.

Key Points ==> 
1) Method name is same.
2) Parameters must be different (number, type, or order).
3) It is an example of compile-time polymorphism.
4) Return type alone cannot differentiate overloaded methods.

Example Program
public class MethodOverloading {

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2.5,3.5));

    }
}

Ways to Overload a Method
1. Different number of parameters
2. Different data types
3. Different order of parameters

Important Rule
This is NOT valid overloading:
    int add(int a, int b)
    double add(int a, int b)
Because only return type is different.

Difference Between Parameter and Argument
Parameter ==> 
- A variable defined in the method declaration.
- Acts as a placeholder for values.
- Used when defining a method.
- Receives the value from arguments.

Argument ==> Arguments are actual values
- The actual value passed to a method.
- Used when calling a method.
- Provides real data to the parameters.
- Passed inside the method call parentheses.
*/