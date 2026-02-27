package labs_examples.fundamentals.labs;


import java.sql.SQLOutput;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int i = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.equals(str2) ;

        System.out.println("Are the strings equal? " + isEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String result = str + str2;
        System.out.println(result);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        // 1. replace(): Replace characters or substrings
        String replaced = str.replace("hello!", "Java");
        System.out.println("After replace: " + replaced); // Java

        // 2. substring(): Extract part of the string
        String sub = str.substring(0, 3);
        System.out.println("Substring: " + sub); // hel

        // 3. contains(): Check if a substring exists
        boolean hasO = str.contains("o");
        System.out.println("Contains 'o'? " + hasO); // true

        // 4. indexOf(): Find the position of a character or substring
        int index = str.indexOf("o");
        System.out.println("First index of 'o': " + index); // 4


    }


}