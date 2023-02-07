/**
 * This is the fourth part (Binary) of the second assignment in CS1420. Here a user will be allowed to input one
 * integer value, between 0 and 255, and the program will convert that value from standard - base 10 - to an
 * eight-bit-binary - base 2 - without the use of  loops, 'if' statements, Boolean logic, library or other automatic
 * methods for calculating binary, or any other Java that executes conditionally. The binary digits are extracted using
 * java computations.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 16, 2023
 **/

package assignment02;
import java.util.Scanner;

public class Binary
{
    public static void main(String[] args)
    {
        // Declaration and initialization of the scanner variable and digit variables.
        Scanner in = CircleArea.in;
        // 1234_5678 digits go from left to right ie. digitOne is value 1, digitTwo is value 2, etc and a temp var.
        int digitOne, digitTwo, digitThree, digitFour, digitFive, digitSix, digitSeven, digitEight, temp;
        // The program asks for any number from 0 to 255 inclusive as an int.
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        in.close();
        // Finds if the 8th digit will be a 1 or 0 | AKA if the number entered is odd or even.
        digitEight = number % 2;
        // Removes the value of the 8th digit from the original number. Thus, digitEight is just the remainder.
        // This process is done with every digit.
        temp = number - digitEight;
        temp = temp / 2;
        digitSeven = temp % 2;
        temp = temp - digitSeven;
        temp = temp/2;
        digitSix = temp % 2;
        temp = temp - digitSix;
        temp = temp/2;
        digitFive = temp % 2;
        temp = temp - digitFive;
        temp = temp/2;
        digitFour = temp % 2;
        temp = temp - digitFour;
        temp = temp/2;
        digitThree = temp % 2;
        temp = temp - digitThree;
        temp = temp/2;
        digitTwo = temp % 2;
        temp = temp - digitTwo;
        temp = temp/2;
        digitOne = temp % 2;
        // The result is printed to the console.
        System.out.println("The decimal number " + number + " is " + digitOne + digitTwo + digitThree + digitFour + digitFive +
                digitSix + digitSeven + digitEight + " in binary.");
    }
}
