/**
 * This class represents a fraction. Within this class there are methods to multiply and divide fractions,
 * as well as ones that get the numerator and denominator of the fraction.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version February 16, 2023
 */

package assignment06;

// This class represents a fraction. Within this class there are methods to multiply and divide fractions,
public class Fraction
{
    // The variables below are instance variables accessible by any method in this class.
    // They are the numerator and denominator of the fraction.
    private long numerator;
    private long denominator;

    /**
     * This is the constructor for the Fraction class. It takes in two integers, the numerator and denominator.
     * @param n numerator
     * @param d denominator
     */
    public Fraction(long n, long d)
    {
        long gcd = gcd(n, d);
        /*
        If the denominator is negative, then the sign of the fraction is negative, so we must make the numerator
        negative and the denominator positive.
         */
        if(d < 0)
        {
            d = -d;
            n = -n;
        }
        this.numerator = n / gcd;
        this.denominator = d / gcd;
    }

    /**
     * This constructor converts a long into its specific fraction form.
     * @param n The long that is to be converted.
     */
    public Fraction(long n)
    {
        this.numerator = n;
        this.denominator = 1;
    }

    /**
     * This method allows two Fractions to be added from each other.
     * @param rightHandSide the right side Fraction of the addition.
     * @return The result after the addition has taken place.
     */
    public Fraction add (Fraction rightHandSide)
    {
        // These variables are the numerator and denominator of the right side of the addition.
        long rightNumerator = rightHandSide.getNumerator();
        long rightDenominator = rightHandSide.getDenominator();
        // These variables are the numerator and denominator of the new fraction.
        long newNumerator = 0;
        long newDenominator = 0;
        // If the denominators are the same, then the addition is simple.
        if(denominator == rightDenominator)
        {
            newNumerator = numerator + rightNumerator;
        }
        // If the denominators are not the same, then we must multiply the denominators and the numerators.
        else
        {
            // The new denominator is the product of the two denominators.
            newDenominator = denominator * rightDenominator;
            // The new numerators are the product of the two denominators, plus the product of the two numerators.
            rightNumerator = denominator * rightNumerator;
            newNumerator = rightDenominator * numerator;
            // The new numerator is the sum of the two other numerators.
            newNumerator = newNumerator + rightNumerator;
            long gcd = gcd(newNumerator, newDenominator);
            // Reduce the fraction.
            newNumerator = newNumerator / gcd;
            newDenominator = newDenominator / gcd;
            // If the denominator is negative, then the sign of the fraction is negative, so we must make the numerator
            if(newDenominator < 0)
            {
                newDenominator = -newDenominator;
                newNumerator = -newNumerator;
            }
        }
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method allows two fractions to be subtracted from each other.
     * @param rightHandSide The right side Fraction of the subtraction.
     * @return The result after the subtraction has taken place.
     */
    public Fraction subtract (Fraction rightHandSide)
    {
        // These variables are the numerator and denominator of the right side of the subtraction.
        long rightNumerator = rightHandSide.getNumerator();
        long rightDenominator = rightHandSide.getDenominator();
        // These variables are the numerator and denominator of the new fraction.
        long newNumerator = 0;
        long newDenominator = 0;
        // If the denominators are the same, then the subtraction is simple.
        if(denominator == rightDenominator)
        {
            newNumerator = numerator - rightNumerator;
            // If the numerator is negative, then the sign of the fraction is negative, so we must make the denominator
            if(newDenominator < 0 && newNumerator < 0)
            {
                newDenominator = -newDenominator;
                newNumerator = -newNumerator;
            }
            // If the denominator is negative, then the sign of the fraction is negative, so we must make the numerator
            if(newDenominator < 0)
            {
                newDenominator = -newDenominator;
                newNumerator = -newNumerator;
            }
        }
        // If the denominators are not the same, then we must multiply the denominators and the numerators.
        else
        {
            // The new denominator is the product of the two denominators.
            newDenominator = denominator * rightDenominator;
            // The new numerators are the product of the two denominators, plus the product of the two numerators.
            rightNumerator = denominator * rightNumerator;
            newNumerator = rightDenominator * numerator;
            // The new numerator is the difference of the two other numerators.
            newNumerator = newNumerator - rightNumerator;
            long gcd = gcd(newNumerator, newDenominator);
            // Reduce the fraction.
            newNumerator = newNumerator / gcd;
            newDenominator = newDenominator / gcd;
            if(newDenominator < 0 && newNumerator < 0)
            {
                newDenominator = -newDenominator;
                newNumerator = -newNumerator;
            }
        }
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method multiplies two fractions together.
     * @param rightHandSide the fraction that is being multiplied by the fraction that is calling this method.
     * @return the product of the two fractions.
     */
    public Fraction multiply(Fraction rightHandSide)
    {
        // Create a variable to hold the result
        Fraction result;

        // Build a new Fraction object - send the products to the constructor.
        result = new Fraction (this.numerator * rightHandSide.numerator,
                this.denominator * rightHandSide.denominator);

        // Pass the resulting fraction back to the caller.
        return result;
    }

    /**
     * This method divides two fractions.
     * @param rightHandSide The fraction that is being divided by the fraction that is calling this method.
     * @return The quotient of the two fractions.
     */
    public Fraction divide(Fraction rightHandSide)
    {
        // Create a variable to hold the result
        Fraction result;

        // Build a new Fraction object - send the products to the constructor.
        result = new Fraction (this.numerator * rightHandSide.denominator,
                this.denominator * rightHandSide.numerator);

        // Pass the resulting fraction back to the caller.
        return result;
    }
    public double toDouble()
    {
        return (double) numerator / denominator;
    }

    /**
     * This finds the gcd (Greatest Common Divisor) of two long integers.
     * @param x number one
     * @param y number two
     * @return The greatest common divisor of these two numbers.
     */
    public long gcd(long x, long y)
    {
        while (y != 0)
        {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    /**
     * This method gets the numerator of the fraction.
     * @return numerator
     */
    public long getNumerator()
    {
        return numerator;
    }

    /**
     * This method gets the denominator of the fraction.
     * @return denominator
     */
    public long getDenominator()
    {
        return denominator;
    }

    /**
     * This method returns the fraction as a string.
     * @return The fraction
     */
    @Override
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }
}
