package strategy;
import java.util.Random;

/**
 * Forward for the Maple Leafs
 * @author Jackson Dawson
 */
public class Forward extends Player {
    public Random rand = new Random();

    /**
     * Assigns the Forward first and last name from parent class
     * @param firstName
     * @param lastName
     */
    public Forward(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    /**
     * Overides setOffenceBehavior setter for Forward Class.
     * Sets Offence Behavior to Pass or Shoot based on a 50/50 chance
     * with a random generator. 
     */
    @Override
    public void setOffenceBehavior()
    {
        int randInt = rand.nextInt(2);
        if(randInt == 0)
            offenceBehavior = new PassBehavior();
        else
            offenceBehavior = new ShootBehavior();
        randInt = 0; 

    }

    /**
     * Overides setDefenceBehavior setter for Forward Class.
     * Sets Defence Behavior to Chase Puck or Block based on a 50/50 chance
     * with a random generator. 
     */
    @Override
    public void setDefenceBehaivor()
    {
        int randInt = rand.nextInt(2);
        if(randInt == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
        randInt = 0; 
    }

    /**
     * Creates String for Player Class of Forward
     * @return String with parent class toString() and player type formatting
     */
    public String toString()
    {
        return super.toString() + "plays the position: Forward";
    }
}
