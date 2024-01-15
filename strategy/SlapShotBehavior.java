package strategy;
/**
 * SlapShotBehavior class that implements interface OffenceBehavior
 * @author Jackson Dawson
 */
public class SlapShotBehavior implements OffenceBehavior{
    /**
     * Creates a String for the Play Class for the Slap Shot 
     * @return String for the SlapShotBehavior
     */
    public String play()
    {
        return "Shoots the puck from the blue line";
    }
}
