public class CWH_24_BreakAndContinue {
    public static void main(String[] args) {
        /*
        1. Break Statement

            The break statement is used to immediately terminate a loop or switch statement.
            Points

            Stops the loop completely.
            Control moves to the statement after the loop.
            Used in for, while, do-while loops and switch cases.
        */
       for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }

        /*
        Continue Statement

            The continue statement is used to skip the current iteration of a loop and move to the next iteration.

            Points
            Skips only the current iteration.
            The loop continues executing.
        */

        for(int j = 1; j <= 5; j++) {
        if(j == 3) {
            continue;
        }
        System.out.println(j);
        }

        // Number 3 is skipped, but the loop continues.
    }
}
/*
        Break	                            Continue
Terminates the loop	                Skips current iteration
Loop stops	                        Loop continues
Used in loops and switch	        Used only in loops
*/
