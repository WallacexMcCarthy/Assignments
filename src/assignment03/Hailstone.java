/**
 * This is the second part (Hailstone) of the third assignment for CS 1420. This project will grab an input from a user,
 * with type int, and preform the hailstorm sequence on it. This sequence consists of the following:
 * 1. if the integer N inputted is 1, the algorithm ends
 * 2. if the integer N is even, the next number is computed as N / 2
 * 3. if the integer N is odd, the next number is computed as N * 3 + 1
 * 4. repeat if necessary.
 *
 * Following this, the program will print out the number of iterations that was needed to coverage the integer N to 1.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 22, 2023
 **/
package assignment03;

import java.util.Scanner;

public class Hailstone
{
    public static void main(String[] args)
    {
        // Declaration and initialization of all used variables.
        boolean isValid = false;
        boolean isDone = false;
        int number = -1;
        int numberOfIterations = 0;
        Scanner in = new Scanner(System.in);
        // While the input is incorrect or there is no input, it will loop through the following.
        while (!isValid)
        {
            System.out.print("Please enter a positive integer: ");
            number = in.nextInt();
            /* Checks if the number is positive or negative and if it is negative, the user will have to input a new
             integer, and if it is positive it will allow the Hailstone sequence to happen on this number.
             Even though 0 is technically a positive integer in this case it is not a valid input.
             */
            if(number > 0)
            {
                isValid = true;
                in.close();
            }else
            {
                System.out.println(number + " is not a valid inout!");
                isValid = false;
            }
        }
        // Prints the inputted number as the first value of this sequence.
        System.out.print(number + " ");
        // This loop continues until isDone is true aka. when the number is or is computed to 1.
        while(!isDone)
        {
            // Stops the sequence if the number is 1.
            if(number == 1)
            {
                isDone = true;
            }else if(number % 2 == 1)
            /*
                If the number is odd, then the number is multiplied by 3 then 1 is added to that product.
             */
            {
                number = number * 3 + 1;
                System.out.print(number + " ");
                numberOfIterations++;
            }else
            /*
                If the number is even, the number will be divided by 2.
             */
            {
                number = number / 2;
                System.out.print(number + " ");
                numberOfIterations++;
            }
        }
        // Prints the number of iterations.
        System.out.println("\n" + "The number of iterations that took place was: " + numberOfIterations);
    }
}
