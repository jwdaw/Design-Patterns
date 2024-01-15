package strategy;
import java.util.Random;

public class Forward extends Player {
    public Random rand = new Random();
    public Forward(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

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

    public String toString()
    {
        return super.toString() + "plays the position: Forward";
    }
}
