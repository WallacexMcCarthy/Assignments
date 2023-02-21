package assignment06;

import java.util.Scanner;
import java.util.SortedMap;

public class FractionRoot
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator for your fraction: ");
        long numerator = scanner.nextLong();
        System.out.println("Enter the denominator for your fraction: ");
        long denominator = scanner.nextLong();
        System.out.println("Enter a approximation for your fraction: ");
        int Z = scanner.nextInt();
        Fraction S = new Fraction(numerator, denominator);
        Fraction currentX = S.divide(new Fraction(2));
        Fraction nextX;
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
        System.out.println("The square root of " + S + " is approximately " + currentX + ".");
        System.out.println(currentX + " is approximately "+ currentX.toDouble() + ".");
    }
}
