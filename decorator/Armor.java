package decorator;
/**
 * Armor Decoration for Warrior
 * @author Jackson Dawson
 */
public class Armor extends PlayerDecorator{
    /**
     * Armor Default Constructor 
     * @param player Calls a instance of player
     */
    public Armor(Player player)
    {
        super(player);
        integrateDecor(lines);
    }
}
