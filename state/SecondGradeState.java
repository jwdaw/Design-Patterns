/**
 * Second state grade class extends state class
 * @author Jackson Dawson
 */
public class SecondGradeState extends State{
    /**
     * Constructor for SecondGradeState class
     * @param spellingList takes in spellingList
     */
    SecondGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader1.getWords("state\\second.txt");
    }

    /**
     * increases grade to third grade
     */
    @Override
    public void increaseGrade() {
        System.out.println("You are now in third grade!");
        spellingList.setState(spellingList.getThirdGradeState());
    }

    /**
     * decreases grade to first grade
     */
    @Override
    public void decreaseGrade() {
        System.out.println("You are now in first grade!");
        spellingList.setState(spellingList.getFirstGradeState());
    }

}