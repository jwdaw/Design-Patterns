package decorator;
/**
 * Shield decoration for warrior
 * @author Jackson Dawson
 */
public class Shield extends PlayerDecorator{
    /**
     * Shield defualt constructor
     * @param player calls an parameter of player
     */
    public Shield(Player player)
    {
        super(player);
        integrateDecor(lines);
    }
}
