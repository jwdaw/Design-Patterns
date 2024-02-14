package iterator;
import java.util.Iterator;

public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position;

    TaskListIterator(Ticket[] tickets)
    {
        this.tickets = tickets;
    }

    public boolean hasNext()
    {
        if(position >= tickets.length || tickets[position] == null)
            return false;
        else
            return true;
    }

    public Ticket next()
    {
        Ticket ticket = tickets[position];
        position = position + 1;
        return ticket;
    }
}
