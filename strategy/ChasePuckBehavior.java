package strategy;
/**
 * Chase Puck Behavior that implements Defence Behavior Class
 * @author Jackson Dawson
 */
public class ChasePuckBehavior implements DefenceBehavior
{
    /**
     * Creates string for the play method of the Chase Puck Behavior
     * @return String for ChasePuckBehavior
     */
    public String play()
    {
        return "Chases the puck";
    }
}
