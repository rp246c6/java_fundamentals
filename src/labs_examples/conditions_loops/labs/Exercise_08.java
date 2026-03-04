package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {

    public static void main(String[] args) {

       final int start = 1000;
       final int step = 3;
       int i = start;

        do {
            // Print every third number from 1000 down to 1
            System.out.println("Every third number is : "+i);
            i -= step;
        }while(i >=1 );
    }
}
