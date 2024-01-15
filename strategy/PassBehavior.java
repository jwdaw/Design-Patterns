package strategy;
/**
 * PassBehavior that Implements Interface OffenceBehavior
 * @author Jackson Dawson
 */
public class PassBehavior implements OffenceBehavior{
    /**
     * Play class creates a string for the Pass Behavior
     * @return String for the pass behavior
     */
    public String play()
    {
        return "Passes to a forward";
    }
}
