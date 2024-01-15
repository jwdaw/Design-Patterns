package strategy;
import java.util.Random;

/**
 * A Maple Leafs Hockey Player 
 * @author Jackson Dawson
 */

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    /**
     * Creates the first and last names of specific player
     * @param firstName
     * @param lastName
     */
    public Player(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Abstract Setters for Defence and Offence behaivors
     */
    public abstract void setDefenceBehaivor();
    public abstract void setOffenceBehavior();

    /**
     * Assigns offence and defence behaviors based off of possesion
     * @param possession
     * @return A String version of a specific play for a player
     */
    public String play(boolean possession)
    {
        if(possession == true)
        {
            setOffenceBehavior();
           return offenceBehavior.play();   
        }
        else
        {
            setDefenceBehaivor();
            return defenceBehavior.play();
        }
    }
    
    /**
     * Creates a string format for the first and last names of players
     * @return String with firstName and lastName in a format with spaces.
     */
    public String toString()
    {
        return firstName + " " + lastName + " ";
    }
}
