import java.util.Scanner;
public class CWH_18_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // INPUT IS A NUMBER / CHAR
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1:
        //         System.out.println("You entered one");
        //         break;
        //     case 2: 
        //         System.out.println("You entered two");
        //         break;
        //     default:
        //         System.out.println("Wrong Input");
        //         break;
        // }

        // INPUT IS A STRING
        // System.out.print("Enter a fruit name: ");
        // String fruit = sc.nextLine();

        // switch (fruit) {
        //     case "apple":
        //         System.out.println("Apple is red.");
        //         break;

        //     case "banana":
        //         System.out.println("Banana is yellow.");
        //         break;

        //     case "mango":
        //         System.out.println("Mango is sweet.");
        //         break;

        //     default:
        //         System.out.println("Fruit not in the list.");
        // }


        // ENHANCED SWITCH CASES , no need to write break here 
        System.out.print("Enter a fruit name: ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "apple" -> {
                System.out.println("Apple is red");
                System.out.println("It is good for health");
            }
            case "banana" -> System.out.println("Banana is yellow");
            case "mango" -> System.out.println("Mango is sweet");
            default -> System.out.println("Fruit not in the list");
        }
        sc.close();
    }
}
