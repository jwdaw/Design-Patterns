package iterator;
/**
 * Ticket class for iterator project
 * @author Jackson Dawson
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * Constructor for Ticket
     * @param name name of the ticket
     * @param teamMember team member assigned to the ticket
     * @param difficulty difficulty of the ticket
     */
    public Ticket(String name, String teamMember, int difficulty)
    {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * gets the name of the ticket
     * @return string name of the ticket
     */
    public String getName()
    {
        return name;
    }

    /**
     * toString method to print out ticket
     * @return string for printout
     */
    public String toString()
    {
        return "- " + name + "("+  difficulty + ")" + " - " + teamMember;
    }
}
