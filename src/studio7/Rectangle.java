package studio7;

import edu.princeton.cs.introcs.StdDraw;

/**
 * The {@code Rectangle} class represents a geometric rectangle with a specified length and width.
 * It includes methods to calculate area, perimeter, check if it is a square,
 * compare area with another rectangle, and draw itself on the screen using StdDraw.
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
     * Calculates and returns the area of the rectangle.
     *
     * @return the area of the rectangle as a double
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle as a double
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Determines if this rectangle is a square, meaning its length and width are equal.
     *
     * @return {@code true} if the rectangle is a square, {@code false} otherwise
     */
    public boolean isSquare() {
        return length == width;
    }

    /**
     * Compares the area of this rectangle with another rectangle to determine
     * if this rectangle has a smaller area.
     *
     * @param other the other rectangle to compare with
     * @return {@code true} if this rectangle has a smaller area than the other rectangle, {@code false} otherwise
     */
    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    /**
     * Provides a string representation of the rectangle, including its length, width,
     * area, perimeter, and whether it is a square.
     *
     * @return a string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", area=" + getArea() +
               ", perimeter=" + getPerimeter() + ", isSquare=" + isSquare() + "]";
    }

    /**
     * Draws the rectangle on the screen using the StdDraw library.
     * The rectangle is drawn centered at (0.5, 0.5) with the specified length and width.
     */
    public void draw() {
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.rectangle(0.5, 0.5, length / 2, width / 2);
    }

    /**
     * Main method for testing the {@code Rectangle} class.
     * It creates two rectangles, displays their properties, compares their areas,
     * and draws them using StdDraw.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0.3, 0.3);
        Rectangle rect2 = new Rectangle(0.6, 0.6);

        // Display details using toString()
        System.out.println(rect1);  // Expected: Rectangle with length=0.3, width=0.3, area=0.09, perimeter=1.2, isSquare=true
        System.out.println(rect2);  // Expected: Rectangle with length=0.6, width=0.6, area=0.36, perimeter=2.4, isSquare=true

        // Test area comparison
        System.out.println("Is rect1 smaller than rect2? " + rect1.isSmallerThan(rect2)); // Expected: true

        // Draw the rectangles
        rect1.draw();
        rect2.draw();
    }
}
