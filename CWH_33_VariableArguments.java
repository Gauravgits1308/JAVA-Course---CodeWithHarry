public class CWH_33_VariableArguments {

    // Variable Arguments 
    static int cartSum(int x,int y, int ...arr) // Here, x and y are compulsory variables to be passed, we can make compulsory variables like this and varags are always created as end parameter
    {
        int result = x+y;
        for(int num:arr){
            result += num ;
        }
        return result ;
    }
    public static void main(String[] args) {
        System.out.println("The Sum is : "+cartSum(2,3,4,4));
    }
}
/*
Variable arguments (varargs) allow a method to accept any number of arguments of the same type.

Key Points
Declared using ... (three dots).
Allows 0 or more arguments.
Internally treated as an array.
Only one varargs parameter is allowed in a method.
It must be the last parameter in the method.
*/