package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        int[] numbers = new int[10]; // Declare an array to store 10 integers

        System.out.println("Enter 10 numbers:"); // Prompt the user

        // Loop to read 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": "); // Prompt for each number
            numbers[i] = scanner.nextInt(); // Store the input in the array
        }

        int sum = 0; // Variable to store the sum of numbers

        // Calculate the sum of all numbers
        for (int num : numbers) {
            sum += num;
        }
        // Calculate the average (use 10 directly instead of a separate count variable)
        double average = (double) sum / numbers.length;

        // Display the results
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);

        scanner.close(); // Close the scanner to free resources

    }
}