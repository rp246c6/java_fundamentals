package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Enter a number from 1-10 :"); // Prompt the user

        int number = scanner.nextInt(); // Store the input in the variable

        boolean found = false; // Flag to track if number is found

        // Loop through the array to find the index of the entered number
        for(int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                System.out.println("Index of the element is: "+ i);
                found = true; // Set flag to true if number is found
                break; // Exit loop once number is found

            }
        }
        // If number was not found in the array
        if (!found) {
            System.out.println("Number not found in the array.");
        }

        scanner.close(); // Close the scanner to free resources

    }
}