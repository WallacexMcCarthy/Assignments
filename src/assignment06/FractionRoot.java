package assignment06;

import java.util.Scanner;
import java.util.SortedMap;

public class FractionRoot
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // The scanner will grab the numerator and denominator from the user.
        System.out.println("Enter the numerator for your fraction: ");
        long numerator = scanner.nextLong();
        System.out.println("Enter the denominator for your fraction: ");
        long denominator = scanner.nextLong();
        // The scanner will grab the number of iterations from the user.
        System.out.println("Enter a approximation for your fraction: ");
        int Z = scanner.nextInt();
        Fraction S = new Fraction(numerator, denominator);
        // This will find the X_0th value.
        Fraction currentX = S.divide(new Fraction(2));
        Fraction nextX;
        // This will find the X_Zth value according to the provided formula.
        for(int i = 0; i < Z; i++)
        {
            System.out.println(currentX);
            nextX = S.divide(currentX);
            System.out.println("nextX: " + nextX);
            nextX = nextX.add(currentX);
            System.out.println("nextX: " + nextX);
            nextX= nextX.multiply(new Fraction(1, 2));
            System.out.println("nextX: " + nextX);
            currentX = nextX;
        }
        // This will print the results.
        System.out.println("The square root of " + S + " is approximately " + currentX + ".");
        System.out.println(currentX + " is approximately "+ currentX.toDouble() + ".");
    }
}
