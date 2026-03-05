package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int a[][] = new int[5][5]; // Declare a 5x5 2D array

        int value = 3; // Starting value

        // Loop starts from index 1 (skips row 0 and column 0)
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {

                a[i][j] = value; // Assign the value

                System.out.print(a[i][j] +"\t");// print the value

                value += 3; // Increment by 3 for each element
            }
            System.out.println();
        }
    }
}
