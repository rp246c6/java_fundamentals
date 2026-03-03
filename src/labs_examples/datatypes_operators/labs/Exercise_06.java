package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        //calculate volume of cylinder
        double pi = 3.14159;
        int height = 5;
        double radius = 3.14;
        double volume = pi * radius * radius * height;

        System.out.println("Volume of cylinder is : " + volume);

        //calculate surface area of cylinder
        double area = 2 * pi * radius * height +
                     2 * pi * radius * radius;

        System.out.println("surface area  of cylinder is : " + area);

    }
}