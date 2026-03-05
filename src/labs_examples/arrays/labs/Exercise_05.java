package labs_examples.arrays.labs;

import java.util.stream.IntStream;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // Create an  array with 3 elements
        int[] array = new int[3];

        // Populate the  array with values
        for (int i = 0; i < array.length; i++) {
                array[i] = i+1;
        }

        //print the array in reverse order
        System.out.println("Printing array in reverse order:");
        for(int i = array.length-1; i>=0 ; i--){
            System.out.println(array[i]);
        }
    }
}
