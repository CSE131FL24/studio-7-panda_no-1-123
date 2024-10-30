package studio7;

/**
 * The {@code Rectangle} class represents a rectangle defined by its length and width.
 * It provides methods to calculate area, perimeter, check if it is a square, 
 * and compare its area with another rectangle.
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructs a new {@code Rectangle} with the specified length and width.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the area of the rectangle.
     *
     * @return the area as a double
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Returns the perimeter of the rectangle.
     *
     * @return the perimeter as a double
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Checks if the rectangle is a square.
     *
     * @return {@code true} if the rectangle is a square, otherwise {@code false}
     */
    public boolean isSquare() {
        return length == width;
    }

    /**
     * Compares the area of this rectangle with another rectangle.
     *
     * @param other the other rectangle to compare with
     * @return {@code true} if this rectangle's area is smaller, otherwise {@code false}
     */
    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return a string with the rectangle's length and width
     */
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    /**
     * Main method for testing the {@code Rectangle} class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 5);
        System.out.println(rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Is square: " + rect1.isSquare());
        System.out.println("Is smaller than rect2: " + rect1.isSmallerThan(rect2));
    }
}
