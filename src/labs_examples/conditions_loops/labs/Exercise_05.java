package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a upper bound number : ");
        // assign input to variable as int
        int upperBound = scanner.nextInt();

        System.out.print("Enter a lower bound number : ");
        // assign input to variable as int
        int lowerBound = scanner.nextInt();


        // Validate bounds
        if (lowerBound > upperBound) {
            System.out.println("Invalid input: lower bound must be less than or equal to upper bound.");
            return;
        }


        int sum = 0;
        int count = 0;

        //summation logic
        for(int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }

        //calculate avergae
        double average = (double) sum/count;

        //output results
        System.out.println("Sum of numbers is: "+ sum);
        System.out.println("Average of numbers is: "+ average);
    }
}
