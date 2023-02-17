/**
 * This class tests the Fraction class. Here we are testing calling the Fraction class as well as the methods.
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version February 16, 2023
 */

package assignment06;

public class FractionTester
{
    public static void main(String[] args)
    {
        int errorCount = 0;
        Fraction f = new Fraction(1, 2);    // A Fraction of value 1/2
        Fraction g = new Fraction(2, 3);    // A Fraction of value 2/3
        Fraction h = new Fraction(3, 4);    // A Fraction of value 3/4

        // Check the toString method
        if(!f.toString().equals("1/2"))
        {
            System.out.println("Error in toString: expected 1/2, got " + f);
            errorCount++;
        }
        if(!g.toString().equals("2/3"))
        {
            System.out.println("Error in toString: expected 2/3, got " + g);
            errorCount++;
        }
        if(!h.toString().equals("3/4"))
        {
            System.out.println("Error in toString: expected 3/4, got " + h);
            errorCount++;
        }

        // Check the getNumerator method
        if(f.getNumerator() != 1)
        {
            System.out.println("Error in getNumerator: expected 1, got " + f.getNumerator());
            errorCount++;
        }
        if(g.getNumerator() != 2)
        {
            System.out.println("Error in getNumerator: expected 2, got " + g.getNumerator());
            errorCount++;
        }
        if(h.getNumerator() != 3)
        {
            System.out.println("Error in getNumerator: expected 3, got " + h.getNumerator());
            errorCount++;
        }

        // Check the getDenominator method
        if(f.getDenominator() != 2)
        {
            System.out.println("Error in getDenominator: expected 2, got " + f.getDenominator());
            errorCount++;
        }
        if(g.getDenominator() != 3)
        {
            System.out.println("Error in getDenominator: expected 3, got " + g.getDenominator());
            errorCount++;
        }
        if(h.getDenominator() != 4)
        {
            System.out.println("Error in getDenominator: expected 4, got " + h.getDenominator());
            errorCount++;
        }

        // Check the add method
        Fraction f_g_Sum = f.add(g);
        if(f_g_Sum.getNumerator() != 7 || f_g_Sum.getDenominator() != 6)
        {
            System.out.println("Error in the add method: expected 7/6, got " + f_g_Sum);
            errorCount++;
        }
        Fraction f_h_Sum = f.add(h);
        if(f_h_Sum.getNumerator() != 5 || f_h_Sum.getDenominator() != 4)
        {
            System.out.println("Error in the add method: expected 5/4, got " + f_h_Sum);
            errorCount++;
        }
        Fraction g_h_Sum = g.add(h);
        if(g_h_Sum.getNumerator() != 17 || g_h_Sum.getDenominator() != 12)
        {
            System.out.println("Error in the add method: expected 17/12, got " + g_h_Sum);
            errorCount++;
        }

        // Check the subtract method
        Fraction f_g_Difference = f.subtract(g);
        if(f_g_Difference.getNumerator() != -1 || f_g_Difference.getDenominator() != 6)
        {
            System.out.println("Error in the subtract method: expected -1/6, got " + f_g_Difference);
            errorCount++;
        }
        Fraction f_h_Difference = f.subtract(h);
        if(f_h_Difference.getNumerator() != -1 || f_h_Difference.getDenominator() != 4)
        {
            System.out.println("Error in the subtract method: expected -1/4, got " + f_h_Difference);
            errorCount++;
        }
        Fraction g_h_Difference = g.subtract(h);
        if(g_h_Difference.getNumerator() != -1 || g_h_Difference.getDenominator() != 12)
        {
            System.out.println("Error in the subtract method: expected -1/12, got " + g_h_Difference);
            errorCount++;
        }

        // Check the multiply method
        Fraction f_g_Product = f.multiply(g);
        if(f_g_Product.getNumerator() != 1 || f_g_Product.getDenominator() != 3)
        {
            System.out.println("Error in the multiply method: expected 1/3, got " + f_g_Product);
            errorCount++;
        }
        Fraction f_h_Product = f.multiply(h);
        if(f_h_Product.getNumerator() != 3 || f_h_Product.getDenominator() != 8)
        {
            System.out.println("Error in the multiply method: expected 3/8, got " + f_h_Product);
            errorCount++;
        }
        Fraction g_h_Product = g.multiply(h);
        if(g_h_Product.getNumerator() != 1 || g_h_Product.getDenominator() != 2)
        {
            System.out.println("Error in the multiply method: expected 1/2, got " + g_h_Product);
            errorCount++;
        }

        // Check the divide method
        Fraction f_g_Quotient = f.divide(g);
        if(f_g_Quotient.getNumerator() != 3 || f_g_Quotient.getDenominator() != 4)
        {
            System.out.println("Error in the divide method: expected 3/4, got " + f_g_Quotient);
            errorCount++;
        }
        Fraction f_h_Quotient = f.divide(h);
        if(f_h_Quotient.getNumerator() != 2 || f_h_Quotient.getDenominator() != 3)
        {
            System.out.println("Error in the divide method: expected 2/3, got " + f_h_Quotient);
            errorCount++;
        }
        Fraction g_h_Quotient = g.divide(h);
        if(g_h_Quotient.getNumerator() != 8 || g_h_Quotient.getDenominator() != 9)
        {
            System.out.println("Error in the divide method: expected 8/9, got " + g_h_Quotient);
            errorCount++;
        }

        // Check the toString method
        if(!f.toString().equals("1/2"))
        {
            System.out.println("Error in the toString method: expected 1/2, got " + f.toString());
            errorCount++;
        }
        if(!g.toString().equals("2/3"))
        {
            System.out.println("Error in the toString method: expected 2/3, got " + g.toString());
            errorCount++;
        }
        if(!h.toString().equals("3/4"))
        {
            System.out.println("Error in the toString method: expected 3/4, got " + h.toString());
            errorCount++;
        }

        // Check if there are any errors that have occurred.
        if(errorCount == 0)
        {
            System.out.println("All tests completed, no errors.");
        }
        else
        {
            System.out.println("All tests completed, errors found.");
        }
    }
}
