package iterator;
/**
 * SCRUMBoard class calls functions to hold all taskLists
 * @author Jackson Dawson
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName)
    {
        this.projectName = projectName;
        todo = new TaskList();
        doing = new TaskList();
        done = new TaskList();
    }

}
