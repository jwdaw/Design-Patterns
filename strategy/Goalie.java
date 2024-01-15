package strategy;
import java.util.Random;

/**
 * A Goalie for the Maple Leafs
 * @author Jackson Dawson
 */
public class Goalie extends Player{
    public Random rand = new Random();

    /**
     * Assigns the goalie first and last name from the parent class
     * @param firstName
     * @param lastName
     */
    public Goalie(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    /**
     * Overrides abstract class Offence Behavior from Player class
     * Sets Offence behavior to Block Goal behavior specifically for Goalie
     */
    @Override
    public void setOffenceBehavior()
    {
        offenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Overrides abstract class Defence Behavior from Player class
     * Sets Defence Behavior to BlockGoalBehavior specifically for Goalie
     */
    @Override
    public void setDefenceBehaivor()
    {
        defenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Creates String for Player Class of Goalie
     * @return String with parent class toString() and player type formatting
     */
    public String toString()
    {
        return super.toString() + "plays the position: Goalie";
    }
}
