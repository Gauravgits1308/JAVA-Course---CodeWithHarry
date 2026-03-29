package StaticInJava;

class Student2 {
    static String college = "ABC";
}

public class StaticVariable {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        System.out.println(Student2.college);
    }
}