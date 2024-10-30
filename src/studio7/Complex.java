package studio7;

/**
 * The {@code Complex} class represents a complex number with real and imaginary parts.
 * It provides methods to add and multiply complex numbers.
 */
public class Complex {
    private double real;
    private double imaginary;

    /**
     * Constructs a new {@code Complex} number with the specified real and imaginary parts.
     *
     * @param real      the real part of the complex number
     * @param imaginary the imaginary part of the complex number
     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Adds this complex number to another complex number.
     *
     * @param other the other complex number to add
     * @return a new {@code Complex} representing the sum
     */
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    /**
     * Multiplies this complex number by another complex number.
     *
     * @param other the other complex number to multiply
     * @return a new {@code Complex} representing the product
     */
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imagPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imagPart);
    }

    /**
     * Returns a string representation of the complex number.
     *
     * @return a string in the format "a + bi", where a is the real part and b is the imaginary part
     */
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    /**
     * Main method for testing the {@code Complex} class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Product: " + c1.multiply(c2));
    }
}
