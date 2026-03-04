package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 * <p>
 * Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        final int start = 2;
        final int step = 2;


        for (int i = start; i < 100; i += step) {
            System.out.println(" Even Number : " + i);
        }
    }
}
