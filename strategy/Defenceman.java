package strategy;

public class Defenceman extends Player {

    public Defenceman(String firstName,String lastName)
    {
        super(firstName, lastName);
    }
    
    @Override
    public void setOffenceBehavior()
    {
        int randInt = rand.nextInt(10);
        if(randInt == 0)
            offenceBehavior = new SlapShotBehavior();
        else
            offenceBehavior = new PassBehavior();
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

    public String toString()
    {
        return "plays the position: Defenceman";
    }
}
