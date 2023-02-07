/**
 * This is the first part (CircleArea) of the second assignment in CS1420. Here a user will be allowed to input a
 * radius of an arbitrary circle, as a double, and the program will output the area of the circle as a double.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 16, 2023
 **/
package assignment02;
import java.util.Scanner;

public class CircleArea
{

    // Declaration and initialization of the scanner variable for all classes.
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        // The program asks for user input
        System.out.print("Enter the radius of your circle: ");
        // The program saves the user input to the variable named radius.
        double radius = in.nextDouble();
        in.close();
        // Computation of the area of a circle - A = pi * r^2.
        double area = radius * radius * Math.PI;
        // Prints the area to the console.
        System.out.println("The area of the circle of radius " + radius + " is: " + area);
    }
}
