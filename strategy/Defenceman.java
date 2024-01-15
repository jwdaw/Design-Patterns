package strategy;
import java.util.Random;

/**
 * Defenceman for Maple Leafs
 * @author Jackson Dawson
 */
public class Defenceman extends Player {
    public Random rand = new Random(); 

    /**
     * Assigns the Defenceman first and last name from the parent class
     * @param firstName
     * @param lastName
     */
    public Defenceman(String firstName,String lastName)
    {
        super(firstName, lastName);
    }
    
    /**
     * Overides setOffenceBehavior setter for Defenceman Class.
     * Sets Offence Behavior to Slap Shot or Pass based on a 1/10 or 9/10 chance
     * with a random generator. 
     */
    @Override
    public void setOffenceBehavior()
    {
        int randInt = rand.nextInt(10);
        if(randInt == 0)
            offenceBehavior = new SlapShotBehavior();
        else
            offenceBehavior = new PassBehavior();
        randInt = 0; 

    }

    /**
     * Overides setDefenceBehavior setter for Defenceman Class.
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
     * Creates String for Player Class of Defenceman
     * @return String with parent class toString() and player type formatting
     */
    public String toString()
    {
        return super.toString() + "plays the position: Defenceman";
    }
}
