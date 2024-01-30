package decorator;
import java.util.ArrayList;
/**
 * Player abstract class that warrior and PlayerDecorator inherit
 * @auther Jackson Dawson
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> lines = new ArrayList<String>();

    /**
     * Player Constructor calls name and lines
     * @param lines ArrayList of type string holding the player lines
     * @param name String name of the warrior
     */
    public Player(ArrayList<String> lines, String name)
    {
        this.lines = lines;
        
        this.name = name;
    }

    /**
     * Method returns name of warrior
     * @return String name of warrior
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * toString metod concatenates lines arraylist into one string
     * @return string of concatenated arraylist lines
     */
    @Override
    public String toString()
    {
        String hero = "";
        for(int i = 0; i<lines.size(); i++)
        {
            hero = hero + "\n" + lines.get(i);
        }
        return hero;
    }

} 
