package studio7;

/**
 * The {@code Fraction} class represents a fraction with a numerator and denominator.
 * It provides methods for addition, multiplication, reciprocation, and simplification.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructs a new {@code Fraction} with the specified numerator and denominator.
     *
     * @param numerator   the numerator of the fraction
     * @param denominator the denominator of the fraction
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    /**
     * Adds this fraction to another fraction and returns the result.
     *
     * @param other the other fraction to add
     * @return a new {@code Fraction} representing the sum
     */
    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    /**
     * Multiplies this fraction by another fraction and returns the result.
     *
     * @param other the other fraction to multiply
     * @return a new {@code Fraction} representing the product
     */
    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    /**
     * Returns the reciprocal of this fraction.
     *
     * @return a new {@code Fraction} representing the reciprocal
     */
    public Fraction reciprocal() {
        return new Fraction(denominator, numerator);
    }

    /**
     * Simplifies the fraction to its lowest terms.
     */
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    /**
     * Computes the greatest common divisor (GCD) of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of {@code a} and {@code b}
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Returns a string representation of the fraction.
     *
     * @return a string in the format "numerator/denominator"
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * Main method for testing the {@code Fraction} class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(1, 3);
        System.out.println("Sum: " + frac1.add(frac2));
        System.out.println("Product: " + frac1.multiply(frac2));
    }
}
