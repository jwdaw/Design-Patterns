package observer;
import java.util.ArrayList;
/**
 * Cartel class implements interface Observer
 * @auther Jackson Dawson
 */
public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings = new ArrayList<Sighting>();

    /**
     * Constructor for cartel class sets cook and registers observer
     * @param cook Subject cook from subject interface
     */
    public Cartel(Subject cook)
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
        Sighting nSighting = new Sighting(location, description, accomplices);
        sightings.add(nSighting);
    }

    /**
     * getLog method prints out information regarding cook
     * @return blank string, unsure of when used
     */
    public String getLog()
    {
        for(int i =0; i<sightings.size(); i++)
        {
            System.out.println(sightings.get(i).getLocation()
            + " (" + sightings.get(i).getDetails() + "), with "
            + sightings.get(i).getAccomplices().toString());
        }
        return "";
    }
}
