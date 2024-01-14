package strategy;

public class Goalie extends Player{
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
        return "plays the position: Goalie";
    }
}
