public class CWH_27_ForEachLoopInArrays {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        // float[] age = {1.2f,3.4f};
        // String[] name = {"Gaurav","Nikku"};

        System.out.println("Length of Marks array : "+marks.length);

        // Printing using for loop
        System.out.println("Printing Using For Loop ==> ");
        for(int i = 0 ; i < marks.length ; i++)
            System.out.println(marks[i]);

        // Printing using ForEach loop
        System.out.println("Printing Using ForEach Loop ==> ");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
