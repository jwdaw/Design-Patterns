package strategy;
import java.util.Random;

/**
 * Blocking behavior implementing the interface DefenceBehavior
 * @author Jackson Dawson
 */
public class BlockBehavior implements DefenceBehavior
{
    public Random rand = new Random();

    /**
     * Play Class that assigns a string for the defence behavior with 
     * a random generator. 
     * @return String for the block behavior
     */
    public String play()
    {
        final int randInt = rand.nextInt(3);
        if(randInt == 0)
            return "blocks player from passing";
        else if(randInt == 1)
            return "blocks player from shooting";
        else
            return "checks player with the puck";
    }
}