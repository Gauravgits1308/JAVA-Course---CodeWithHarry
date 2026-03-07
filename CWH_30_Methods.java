public class CWH_30_Methods {
    // Method to find square of a number
    static int square(int num){
        return num*num;
    }
    public static void main(String[] args) {
        System.out.println("The square of 5 is : "+square(5));
    }
}

// METHOD INVOCATION USING OBJECT CREATION...
// public class CWH_30_Methods {
//     // Method to find square of a number
//     int square(int num){
//         return num*num;
//     }
//     public static void main(String[] args) {
//         CWH_30_Methods obj = new CWH_30_Methods();
//         System.out.println("The square of 5 is : "+obj.square(5));
//     }
// }

/*
Methods in Java
A method in Java is a block of code that performs a specific task and is executed when it is called.

Key Points ==> 
Used to reuse code.
Improves readability and modularity.
A method can take parameters and return a value.

Syntax of a Method...
returnType methodName(parameters) {
    // code to be executed
}

Types of Methods ==> 
1. Method without parameters
2. Method with parameters
3. Method with return value
4. Method without return value (void)

IMPORTANT ==> 
In Java, a static method can only directly call other static methods.
Since main() is static, the method square() must also be static to call it without creating an object.

    If our main method is static :
        -> We will only be able to call a static method.
        -> We can call a non-static method only be creating an object of the class.
*/