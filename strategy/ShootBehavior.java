package strategy;

/**
 * Sets String for Offence Behaivor "ShootBehaivor"
 * @author Jackson Dawson
 */
public class ShootBehavior implements OffenceBehavior{

    /**
     * A specific string for the Shoot Behavior
     * @return Returns only one string for ShootBehavior
     */
    public String play()
    {
        return "Shoots at the goal";
    }
}
