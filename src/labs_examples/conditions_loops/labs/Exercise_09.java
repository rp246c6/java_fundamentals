package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 20) {

            //Stop at first multiple of 7
            if (i % 7 == 0) {
                System.out.println("Found a multiple of 7: " + i);
                break; // Exit the loop immediately
            }
            System.out.println("Checking: " + i);
            i++;
        }

        System.out.println("Loop ended.");

    }
}
