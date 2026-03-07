public class CWH_13_IntroToStrings {
    public static void main(String[] args){
        //String name = new String("Harry") ;
        //String name = "Harry" ;
        // Statement 3 and 4 have same functionality.
        //System.out.println(name);

        String s = "Hello" ;
        System.out.println(s);
        s = s + " World" ;
        System.out.println(s);

    }
}
/*
String is a class in Java, but it can be used like a primitive data type because:

1️⃣ Java provides special support for String, making it easy to use without creating objects explicitly.

2️⃣ We can create a String without using the new keyword, which makes it feel like a primitive type.

3️⃣ Java stores such strings in a String Constant Pool, which improves memory efficiency.

4️⃣ Even though it looks simple like a primitive, String is still an object of the String class.

5️⃣ Therefore, String behaves like a primitive in syntax but internally it is a class (object type).


 */