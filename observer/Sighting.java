package observer;
import java.util.ArrayList;
/**
 * Sighting class that holds information of cook sightings
 * @author Jackson Dawson
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices = new ArrayList<String>();
    
    /**
     * Sighting constructor, sets instance variables location, details, and accomplices
     * @param location location from cook
     * @param details details from cook
     * @param accomplices accomplices from cook
     */
    public Sighting(String location, String details, ArrayList<String> accomplices){
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Method to return string of location
     * @return String location containing location data
     */
    public String getLocation(){
        return location;
    }

    /**
     * Method to return string of details
     * @return String details containing details data
     */
    public String getDetails(){
        return details;
    }

    /**
     * Method returns string of accomplices
     * @return String accomplices containing locaiton data
     */
    public String getAccomplices(){
        return accomplices.toString();
    }
}
