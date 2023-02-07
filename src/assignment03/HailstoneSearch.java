/**
 * This is the third part (HailstoneSearch) of the third assignment for CS 1420. This project will grab an input I
 * from a user, with type int, and will find the integer that will have the hailstone sequence with I iterations.
 * A hailstone sequence goes as follows:
 * 1. if the integer N inputted is 1, the algorithm ends
 * 2. if the integer N is even, the next number is computed as N / 2
 * 3. if the integer N is odd, the next number is computed as N * 3 + 1
 * 4. repeat if necessary.
 *
 * Following this, the program will print out the smallest number that will computer to 1 with exactly I iterations.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 22, 2023
 **/
package assignment03;

import java.util.Scanner;

public class HailstoneSearch
{
    /**
     * Public static method that returns a int which is the number of iterations that it will take for a integer called
     * number to converce to 1 using the hailstone sequence.
     * @param number The integer of which the hailstone sequence is preformed on.
     * @return The iterations that took place.
     */
    public static int computeHailstone(int number)
    {
        int iterations = 0;
        boolean isDone = false;
        while(!isDone)
        {
            if(number == 1)
            {
                isDone = true;
            }else if(number % 2 == 1 || number == 0)
            {
                number = number * 3 + 1;
                iterations++;
            }else
            {
                number = number / 2;
                iterations++;
            }
        }
        return iterations;
    }

    public static void main(String[] args)
    {
        // declaration and initialization of all variables used in this project
        Scanner in = new Scanner(System.in);
        boolean foundSolution = false;
        int iterations = -1;
        int numberIterations;
        int outputNumber = -1;
        boolean isValid = false;
        // checks for correct inputs.
        while (!isValid)
        {
            System.out.print("Please enter a positive integer: ");
            iterations = in.nextInt();
            in.close();
            if(iterations > 0)
            {
                isValid = true;
                in.close();
            }else
            {
                System.out.println(iterations + " is not a valid inout!");
                isValid = false;
            }
        }
        // does this counting loop until there is a solution to the parameter AKA a number that converges to 1 with
        // that many iterations.

        for(int index = 0; !foundSolution; index++)
        {
            numberIterations = computeHailstone(index);
            if(numberIterations == iterations)
            {
                outputNumber = index;
                break;
            }
        }
        System.out.print("The Hailstone sequence starting at " + outputNumber +
                        " takes " + iterations + " steps to converge to 1.");

    }
}
