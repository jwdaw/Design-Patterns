package strategy;
import java.util.Random;
public class BlockBehavior implements DefenceBehavior
{
    public Random rand = new Random();
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