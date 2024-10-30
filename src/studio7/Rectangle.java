package studio7;

<<<<<<< HEAD
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
=======
import edu.princeton.cs.introcs.StdDraw;

/**
 * The Rectangle class represents a geometric rectangle with a specified length and width.
 * It includes methods to calculate area, perimeter, check if it is a square,
 * compare area with another rectangle, and draw itself on the screen.
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructs a Rectangle with the specified length and width.
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
     * @return the area of the rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Determines if this rectangle is a square, meaning its length and width are equal.
     *
     * @return true if the rectangle is a square, false otherwise
     */
    public boolean isSquare() {
        return length == width;
    }

    /**
     * Compares the area of this rectangle with another rectangle to determine
     * if this rectangle is smaller in terms of area.
     *
     * @param other the other rectangle to compare with
     * @return true if this rectangle has a smaller area than the other rectangle, false otherwise
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
    
    public static void main(String[] args) { 
    	 Rectangle rect1 = new Rectangle(0.3, 0.3);
         Rectangle rect2 = new Rectangle(0.6, 0.6);

         // Display details using toString()
         System.out.println(rect1);  // Expected: Rectangle with length=0.3, width=0.3, area=0.09, perimeter=1.2, isSquare=true
         System.out.println(rect2);  // Expected: Rectangle with length=0.6, width=0.6, area=0.36, perimeter=2.4, isSquare=true

         // Test area comparison
         System.out.println("Is rect1 smaller than rect2? " + rect1.isSmallerThan(rect2)); // Expected: false

         // Draw the rectangles
         rect1.draw();
         rect2.draw();
    }
}


  
>>>>>>> branch 'main' of https://github.com/CSE131FL24/studio-7-panda_no-1-123.git
