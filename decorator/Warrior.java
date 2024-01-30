package decorator;
/**
 * Warrior class extends Player class and adds name
 * @author Jackson Dawson
 */
public class Warrior extends Player{
    /**
     * Warrior class extended 
     * @param name
     */
    public Warrior(String name)
    {
        super(FileReader.getLines("decorator\\warrior.txt"), name);
    }
}
