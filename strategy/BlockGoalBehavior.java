package strategy;
import java.util.Random;

/**
 * Blocking Goal behavior implementing interface DefenceBehavior and Offence Behavior
 * @author Jackson Dawson
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior
{
    public Random rand = new Random();

    /**
     * Play class that sets a string for the block goal behavior with a random generator
     * @return String for blocking goal behavior with random chance out of four choices.
     */
    public String play()
    {
        int randInt = rand.nextInt(4);
        if(randInt == 0)
            return "hand blocks the puck";
        else if(randInt == 1)
            return "catches the puck";
        else if(randInt == 2)
            return "blocks puck with knee pads";
        else
            return "blocks puck with stick";

    }
}
