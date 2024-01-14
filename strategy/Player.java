package strategy;
import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;
    public Player(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void setDefenceBehaivor();
    public abstract void setOffenceBehavior();

    public String play(boolean possession)
    {
        if(possession == true)
        {
           return defenceBehavior.play();   
        }
        else
        {
            return offenceBehavior.play();
        }
    }
    public String toString()
    {
        return "";
    }
}
