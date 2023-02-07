/**
 * This is the first part (PowersOfTwo) of the third assignment for CS 1420. This project outputs all the powers of 2 from
 * the range [0, 16]. AKA 2^0 , 2^1 , ... , 2^15 , 2^16 .
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 22, 2023
 **/

package assignment03;

public class PowersOfTwo
{
    public static void main(String[] args)
    {
        // the integer variable that will be use in all the calculations.
        int output = 0;
        // a loop that covers every value from 0 to 16
        for(int index = 0; index <= 16; index++)
        {
            // multiplies the output by 2 so as this loop runs this represents powers of 2.
            output = output * 2;
            // when anything is raised to the power of 2, the values will be 1, so I have an if exception
            // in this loop.
            if (index == 0)
            {
                output = 1;
            }
            // prints the powers of 2 to the console.
            System.out.println(output);
        }
    }
}
