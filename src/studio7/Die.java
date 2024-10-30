package studio7;

import java.util.Random;

/**
 * The {@code Die} class represents a die with a specified number of sides.
 * It allows for rolling the die to get a random result between 1 and the number of sides.
 */
public class Die {
    private int sides;
    private Random random;

    /**
     * Constructs a new {@code Die} with the specified number of sides.
     *
     * @param sides the number of sides for the die
     */
    public Die(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    /**
     * Rolls the die and returns a random integer between 1 and the number of sides.
     *
     * @return a random integer representing the result of the roll
     */
    public int roll() {
        return random.nextInt(sides) + 1;
    }

    /**
     * Returns a string representation of the die.
     *
     * @return a string with the number of sides
     */
    @Override
    public String toString() {
        return "Die[sides=" + sides + "]";
    }

    /**
     * Main method for testing the {@code Die} class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Die die = new Die(6);
        System.out.println(die);
        System.out.println("Roll: " + die.roll());
    }
}
