package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // Create a 2D  array with 3 rows
        int[][] array = new int[3][];

        // Define different column sizes for each row
        array[0] = new int[3]; // Row 0 has 3 elements
        array[1] = new int[5]; // Row 1 has 5 elements
        array[2] = new int[2]; // Row 2 has 2 elements

        // Populate the  array with values
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
            }
        }

        //loop to print elements
        for(int[] arr : array) {
            for(int ar : arr) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }

    }
}
