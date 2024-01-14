package strategy;

public class Forward extends Player {
    
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
    }

    @Override
    public void setDefenceBehaivor()
    {
        int randInt = rand.nextInt(2);
        if(randInt == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }
}
