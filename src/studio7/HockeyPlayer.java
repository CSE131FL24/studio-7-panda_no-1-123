package studio7;

/**
 * The {@code HockeyPlayer} class represents a hockey player with a name, jersey number,
 * shooting hand, and performance statistics.
 * It provides methods to record goals, assists, and games played.
 */
public class HockeyPlayer {
    private String name;
    private int jerseyNumber;
    private String shootingHand;
    private int goals;
    private int assists;
    private int gamesPlayed;

    /**
     * Constructs a new {@code HockeyPlayer} with the specified name, jersey number, and shooting hand.
     *
     * @param name          the name of the player
     * @param jerseyNumber  the jersey number of the player
     * @param shootingHand  the shooting hand of the player (e.g., "right" or "left")
     */
    public HockeyPlayer(String name, int jerseyNumber, String shootingHand) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.shootingHand = shootingHand;
        this.goals = 0;
        this.assists = 0;
        this.gamesPlayed = 0;
    }

    /**
     * Records the player's performance in a completed game by adding goals and assists.
     *
     * @param goals   the number of goals scored in the game
     * @param assists the number of assists made in the game
     */
    public void completeGame(int goals, int assists) {
        this.goals += goals;
        this.assists += assists;
        this.gamesPlayed++;
    }

    /**
     * Returns the total number of points scored by the player (goals + assists).
     *
     * @return the total number of points
     */
    public int getTotalPoints() {
        return goals + assists;
    }

    /**
     * Returns a string representation of the hockey player's information.
     *
     * @return a string with the player's name, jersey number, and performance stats
     */
    @Override
    public String toString() {
        return name + " (#" + jerseyNumber + ") - " + goals + " Goals, " 
               + assists + " Assists, " + gamesPlayed + " Games Played";
    }

    /**
     * Main method for testing the {@code HockeyPlayer} class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        HockeyPlayer player = new HockeyPlayer("Wayne", 99, "right");
        player.completeGame(3, 2);
        System.out.println(player);
        System.out.println("Total points: " + player.getTotalPoints());
    }
}
