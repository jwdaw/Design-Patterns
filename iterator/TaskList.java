package iterator;
/**
 * TaskList class for iterator project
 * @author Jackson Dawson
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Constructor for TaskList
     * @param name name of the task list
     */
    public TaskList(String name)
    {
        this.name = name;
        //counted ticket calls in MasterDriver
        tickets = new Ticket[10];
        count = 0;
    }
    
    /**
     * adds a ticket to the task list
     * @param name name of the ticket
     * @param teamMember team member assigned to ticket
     * @param difficulty difficulty of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty)
    {
        Ticket temp = new Ticket(name, teamMember, difficulty);
        tickets[count] = temp;
        count++;
    }

    /**
     * adds a ticket to the task list
     * @param ticket ticket to be added
     */
    public void addTicket(Ticket ticket)
    {
        tickets[count] = ticket;
        count++;
    }

    /**
     * gets a ticket from the task list
     * @param name name of the ticket
     * @return ticket if found or null
     */
    public Ticket getTicket(String name)
    {
        for (int i = 0; i < count; i++)
        {
            if (tickets[i].getName().equals(name))
            {
                return tickets[i];
            }
        }
        return null;
    }

    /**
     * initializes an iterator for the task list
     * @return TaskListIterator
     */
    public TaskListIterator createIterator()
    {
        return new TaskListIterator(tickets);
    }

    /**
     * returns a string of the task list
     * @return string for printout
     */
    public String toString()
    {
        String result = name + "\n";
        for (int i = 0; i < count; i++)
        {
            result += tickets[i].toString() + "\n";
        }
        return result;
    }
}
