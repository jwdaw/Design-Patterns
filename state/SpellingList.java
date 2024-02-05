/**
 * SpellingList class creates spellingList for Driver
 * @author Jackson Dawson
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Constructor for spellingList class
     */
    public SpellingList()
    {
       firstGradeState = new FirstGradeState(this);
       secondGradeState = new SecondGradeState(this);
       thirdGradeState = new ThirdGradeState(this);
       setState(firstGradeState);
    }

    /**
     * returns next word in spelling list
     * @return String for the next word in said state
     */
    public String getNextWord()
    {
        return state.getNextWord();
    }

    /**
     * increases grade of current state
     */
    public void increaseGrade()
    {
        state.increaseGrade();
    }

    /**
     * decreases grade of current state
     */
    public void decreaseGrade()
    {
        state.decreaseGrade();
    }

    /**
     * returns the firstGrade State
     * @return firstGradeState
     */
    public State getFirstGradeState()
    {
        return firstGradeState;
    }

     /**
     * returns the SecondGrade State
     * @return SecondGradeState
     */
    public State getSecondGradeState()
    {
        return secondGradeState;
    }

     /**
     * returns the ThirdGrade State
     * @return ThirdGradeState
     */
    public State getThirdGradeState()
    {
        return thirdGradeState;
    }

    /**
     * Sets the state to not be null
     * @param state1
     */
    public void setState(State state1)
    {
        this.state = state1;
    }
    
}