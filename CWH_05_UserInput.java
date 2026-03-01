import java.util.Scanner;
public class CWH_05_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ID : ");
        int ID = sc.nextInt();
        System.out.print("Enter your Name : ");
        String name = sc.nextLine(); // Reads whole line 
        String str = sc.next(); // Reads only the first word of the input
        System.out.println("Your ID is : " + ID);
        System.out.println("Your name is : " + name);

        System.out.println("Is a number : " + sc.hasNextInt()); // To check whether user entered a number
        sc.close(); // Closing the object
        
    }
}

/*
We take input in Java using Scanner calls and cretaing a object to call it.
It is always a good practice to close an object.
sc.nextLine(); // Reads whole line 
sc.next(); // Reads only the first word of the input
 */