package iterator;
import java.util.Iterator;
/**
 * TaskListIterator class for Iterator project
 * @author Jackson
 */
public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position;

    /**
     * Constructor for TaskListIterator
     * @param tickets array of tickets
     */
    TaskListIterator(Ticket[] tickets)
    {
        this.tickets = tickets;
        position = 0;
    }

    /**
     * checks if there is another ticket in the array
     * @return boolean value if there is another ticket
     */
    public boolean hasNext()
    {
        if(tickets[position] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }

    /**
     * gets the next ticket in the array tickets
     * @return next ticket from the array
     */
    public Ticket next()
    {
        Ticket temp = tickets[position];
        return temp;
    }
}
