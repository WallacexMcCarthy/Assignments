/**
 * This is the third part (Temperature) of the second assignment in CS1420. Here a user will be allowed to input one
 * integer value as the Fahrenheit temperature. Then the program will convert this input to the corresponding
 * Celsius value and display that result.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 16, 2023
 **/
package assignment02;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        // Declaration and initialization of the scanner variable.
        Scanner in = CircleArea.in;
        // The program asks for the temperature in degrees Fahrenheit as an int.
        System.out.print("Enter the temperature in Fahrenheit: ");
        int temperature = in.nextInt();
        in.close();
        /* The program calculates the temperature from Fahrenheit to Celsius using the equation:
        C = (5/9) * (Fahrenheit - 32) rearranged into C = ((Fahrenheit - 32)* 5) / 9 */
        int celsius = ((temperature - 32) * 5) / 9;
        // The program prints the converted temperature to the console.
        System.out.println(temperature + "degrees Fahrenheit in degrees Celsius is: " + celsius);
    }
}
