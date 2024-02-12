/**
 * Third grade state extends class State
 * @author Jackson Dawson
 */
public class ThirdGradeState extends State{
    /**
     * ThirdGradeState constructor
     * @param spellingList takes in spellingList
     */
    ThirdGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader1.getWords("state\third.txt");
    }
    /**
     * increases grade to nothing and displays error msg
     */
    @Override
    public void increaseGrade() {
        System.out.println("Current system only has up to grade 3 :(");
    }
    /**
     * decreases grade to second grade
     */
    @Override
    public void decreaseGrade() {
        System.out.println("You are now in second grade.");
        spellingList.setState(spellingList.getSecondGradeState());
    }

}