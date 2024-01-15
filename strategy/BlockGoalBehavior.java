package strategy;
import java.util.Random;
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior
{
    public Random rand = new Random();
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
