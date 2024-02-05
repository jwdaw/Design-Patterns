
import java.util.ArrayList;
import java.util.Random;
/**
 * Abstract class state which is the template for each grade
 * @author Jackson Dawson
 */
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words = new ArrayList<String>();
    private Random rand;

    /**
     * Constructor for SpellingList
     * @param spellingList of class SpellingList
     */
    public State(SpellingList spellingList)
    {
        this.spellingList = spellingList;
    }

    /**
     * Gets the next word in spellingList
     * @return next word in spellingList
     */
    public String getNextWord(){
        rand = new Random();
        return words.get(rand.nextInt(words.size()-1));
    }
    /**
     * Abstract classes IncreaseGrade and Decrease Grade to be created in inhereted classes
     */
    public abstract void increaseGrade();
    public abstract void decreaseGrade();
}
