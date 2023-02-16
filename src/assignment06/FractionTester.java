/**
 * This class tests the Fraction class. Here we are testing calling the Fraction class as well as the methods.
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version February 14, 2023
 */

package assignment06;

public class FractionTester
{
    public static void main(String[] args)
    {
        System.out.println ("Fraction tester:");
        // Create a new fractions
        Fraction f = new Fraction (2, 3);
        Fraction g = new Fraction (1, 4);
        Fraction h = new Fraction (5, 1);
        /*
        Print out the fractions: when calling a fraction, it will automatically call the toString method, so we
        will not need to use the dot operator and call the toString() method individually.
        AKA: System.out.println("Fraction f contains: " + f.toString()); - is unnecessary.
         */
        System.out.println ("Fraction f contains: " + f);
        System.out.println ("F's numerator is: " + f.getNumerator());
        System.out.println ("F's denominator is: " + f.getDenominator());
        System.out.println ("Fraction g contains: " + g);
        System.out.println ("G's numerator is: " + g.getNumerator());
        System.out.println ("G's denominator is: " + g.getDenominator());
        System.out.println ("Fraction h contains: " + h);
        System.out.println ("H's numerator is: " + h.getNumerator());
        System.out.println ("H's denominator is: " + h.getDenominator());

        System.out.println("Multiplication and division tests:");

        System.out.println("Multiplication:");
        // Multiply the fractions together

        System.out.println("Multiply f by g: " + f.multiply(g));
        System.out.println("Multiply g by f: " + g.multiply(f));
        System.out.println("Multiply f by h: " + f.multiply(h));
        System.out.println("Multiply h by f: " + h.multiply(f));
        System.out.println("Multiply g by h: " + g.multiply(h));
        System.out.println("Multiply h by g: " + h.multiply(g));

        System.out.println("Division:");
        // Divide the fractions

        System.out.println("Divide f by g: " + f.divide(g));
        System.out.println("Divide g by f: " + g.divide(f));
        System.out.println("Divide f by h: " + f.divide(h));
        System.out.println("Divide h by f: " + h.divide(f));
        System.out.println("Divide g by h: " + g.divide(h));
        System.out.println("Divide h by g: " + h.divide(g));
        System.out.println(f.add(g));
        System.out.println(f.subtract(g));

        System.out.println ("Fraction tester end.");
    }
}
