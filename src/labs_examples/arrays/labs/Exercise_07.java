package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Populate the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        // Print all elements
        System.out.println("All fruits: " + fruits);

        // Explore some useful methods
        System.out.println("Size of ArrayList: " + fruits.size());
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry"));

        // Remove an element
        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits);

        // Replace an element
        fruits.set(1, "Blueberry");
        System.out.println("After replacing index 1: " + fruits);

        // Clear the ArrayList
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
