/**
 * This is the second part (Hypotenuse) of the second assignment in CS1420. Here a user will be allowed to input two
 * values for the two side lengths of a right triangle. Then the program will compute the hypotenuse of that triangle
 * and display the hypotenuse.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 16, 2023
 **/
package assignment02;

import java.util.Scanner;

public class Hypotenuse
{
    public static void main(String[] args)
    {
        Scanner in = CircleArea.in;
        // Declaration and initialization of the scanner variable.
        /* The program asks for the side lengths of a 90 degree triangle as two separate inputs, and stores them as
           variables named sideOne and sideTwo. */
        System.out.print("Enter the first side length of a 90 degree triangle: ");
        double sideOne = in.nextDouble();
        System.out.print("Enter the second side length of a 90 degree triangle: ");
        double sideTwo = in.nextDouble();
        // The program calculates the hypotenuse of the triangle using the equation c = sqr(sideOne ^ 2 + sideTwo ^ 2)
        double hypotenuse = Math.sqrt(sideOne * sideOne + sideTwo * sideTwo);
        // The program prints the outputs to the console.
        System.out.println("The triangle with side lengths " +
                            sideOne + " and " + sideTwo + " has a hypotenuse of " + hypotenuse);
    }
}
