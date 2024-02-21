package iterator;
/**
 * SCRUMBoard class for iterator project
 * @author Jackson Dawson
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Constructor for SCRUMBoard
     * @param projectName name of the project
     */
    public SCRUMBoard(String projectName)
    {
        this.projectName = projectName;
        todo = new TaskList("ToDo:");
        doing = new TaskList("Doing:");
        done = new TaskList("Done:");
    }

    /**
     * adds a ticket to the todo list
     * @param name name of the ticket
     * @param teamMember team member assigned to the ticket
     * @param difficulty difficulty of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty)
    {
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * adds a ticket to the todo list
     * @param ticket ticket to be added
     * @return boolean value checks if ticket is added
     */
    public boolean startTicket(String name)
    {
        Ticket ticket = todo.getTicket(name);
        //checks to see if ticket exists
        if (ticket != null)
        {
            doing.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * moves a ticket from doing to done
     * @param name name of the ticket
     * @return boolean value checks if ticket is done
     */
    public boolean finishTicket(String name)
    {
        Ticket ticket = doing.getTicket(name);
        //also checks to see if ticket exists
        if (ticket != null)
        {
            done.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * toString method for SCRUMBoard
     * @return string for printout
     */
    public String toString()
    {
        return "***** " + projectName + " *****" + "\n" + todo.toString() + "\n" + doing.toString() + "\n" + done.toString();
    }
}
