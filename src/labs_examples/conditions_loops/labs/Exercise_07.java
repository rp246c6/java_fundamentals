package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a word : ");
        // assign input to variable as int
        String word = scanner.nextLine();

        int i = 0;
        boolean found = false;


        while( i <  word.length()) {

            char ch = Character.toLowerCase(word.charAt(i));

            if(ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' || ch == 'u')  {
                System.out.println("word is :"+word);
                System.out.println(" First vowel is : "+word.charAt(i));
                found = true;
                break;
            }
            i++;
        }

        if (!found) {
            System.out.println("Word is: " + word);
            System.out.println("No vowel found in the word.");
        }

    }
}
