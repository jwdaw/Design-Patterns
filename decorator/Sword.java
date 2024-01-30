package decorator;
/**
 * Sword decoration for warrior
 * @author Jackson Dawson
 */
public class Sword extends PlayerDecorator{
    public Sword(Player player)
    {
        super(player);
        integrateDecor(lines);
    }
}
