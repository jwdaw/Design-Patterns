package observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Police Observer Implements Interface Observer
 * @author Jackson Dawson
 */
public class Police implements Observer{
    private Subject cook;
    private ArrayList<String> locations = new ArrayList<String>();
    private String notes;
    private ArrayList<String> people = new ArrayList<String>();

    /**
     * Police Constructor declares cook instance and registers observer
     * @param cook call to the cook subject that the observer is registering to
     */
    public Police(Subject cook)
    {
        this.cook = cook;
        cook.registerObserver(this);
        
    }

    /**
     * update method pushes information update to observers
     * @param location location from cook class
     * @param description is the description from the cook class
     * @param accomplices is the ArrayList of accomplices from cook class
     */
    public void update(String location, String description, ArrayList<String> accomplices)
    {
        locations.add(location);
        notes = notes + ": " + description;
        for(int i = 0; i<accomplices.size(); i++)
        {
            people.add(accomplices.get(i));
        }
    }

    /**
     * getLog prints out the DEA or Police Notes using location, notes, and people data.
     * @return nothing/blank string, as I wasnt sure if it was used
     */
    public String getLog()
    {
        //Locations
        System.out.println("Locations: ");
        for(int i=0; i < locations.size(); i++)
        {
            String sLocation = locations.get(i);
            System.out.println("- " + sLocation);
        }
        //Notes
        System.out.println("\nNotes: ");
        ArrayList<String> aNotes = new ArrayList<String>(Arrays.asList(notes.split(":")));
        for(int i = 1; i<aNotes.size(); i++)
        {
                System.out.println("- " + aNotes.get(i));
        }
        //Acommplices
        System.out.println("\nAccomplices");
        for(int i =0; i < people.size(); i++)
        {
            System.out.println("- " + people.get(i));
        }
        return "";

    }

}
