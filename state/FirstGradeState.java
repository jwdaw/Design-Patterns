/**
 * First Grade Class extends State Class
 * @author Jackson Dawson
 */
public class FirstGradeState extends State{
    /**
     * Constructor for first grade class
     * @param spellingList takes in parameter spelling list
     */
    FirstGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords("state\\first.txt");
    }

    /**
     * increases grade to second grade
     */
    @Override
    public void increaseGrade() {
        System.out.println("You are now in second grade.");
        spellingList.setState(spellingList.getSecondGradeState());
    }

    /**
     * deacreases grade to nothing and prints error msg
     */
    @Override
    public void decreaseGrade() {
        System.out.println("You can't go below first grade!");
    }

}