public class CWH_03_VariablesAndDataTypes {
    int number;
    char alphabet;
    short num;
    long numberl;

    public static void main(String[] args) {

        CWH_03_VariablesAndDataTypes obj = new CWH_03_VariablesAndDataTypes();

        System.out.println("int : " + obj.number);
        System.out.println("char : " + obj.alphabet);
        System.out.println("short : " + obj.num);
        System.out.println("long : " + obj.numberl);
    }
}

/*
Anatomy Of a Java Program
    Documentation Section - Suggested
    Package Statement - Optional
    Import Statements - Optional
    Interface Statements - Optional
    Class Definitions - Optional
    Main Method - Esential

Data Types
    1. Primitive Data Type -> Intrinsic
        int,long,double,short,byte,float,char,bool
    2. Non-Primitive Data Type -> Derived

NOTE ==>
    Instance Variables : 
        Declared inside a class but outside any method
        Belong to an object (instance) of the class
        Stored in heap memory
        Exist as long as the object exists
        ✅ Have default values (0, false, null, etc.)
        Can use access modifiers (private, public, etc.)
    
    Local Variables : 
        Declared inside a method, constructor, or block
        Scope is limited to that method/block
        Stored in stack memory
        Exist only while the method executes
        ❌ No default value (must be initialized before use)
        Cannot use access modifiers like public, private

    Default value for char is null character. 
 */
