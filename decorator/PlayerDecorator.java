package decorator;
import java.util.ArrayList;
/**
 * Player Decorator class decorates warrior
 * @author Jackson Dawson
 */
public abstract class PlayerDecorator extends Player {
    private Player player;
    /**
     * PlayerDecorator default constructor
     * @param player calls a parameter of player
     */
    public PlayerDecorator(Player player)
    {
        super(FileReader.getLines("./decorator/txt/warrior.txt"), player.getName());
    }
    /**
     * Integrate Decoration into warrior
     * @param decor arrayList of decor 
     */
    protected void integrateDecor(ArrayList<String> decor)
    {
        decor = new ArrayList<String>();
    }
} 

    
