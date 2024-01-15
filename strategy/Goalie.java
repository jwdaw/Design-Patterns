package strategy;
import java.util.Random;

public class Goalie extends Player{
    public Random rand = new Random();
    public Goalie(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    @Override
    public void setOffenceBehavior()
    {
        offenceBehavior = new BlockGoalBehavior();
    }

    @Override
    public void setDefenceBehaivor()
    {
        defenceBehavior = new BlockGoalBehavior();
    }

    public String toString()
    {
        return super.toString() + "plays the position: Goalie";
    }
}
