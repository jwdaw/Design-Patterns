package observer;
import java.util.ArrayList;
/**
 * Subject interface the registers and updated observers
 * @author Jackson Dawson
 */
public interface Subject {
    /**
     * Method registers observers to subject
     * @param observer Specifies which observer is to be registered
     */
    public void registerObserver(Observer observer);
    /**
     * similar to register, but rather it removes the observer from the registry
     * @param observer Specifies the observer to be removed
     */
    public void removeObserver(Observer observer);
    /**
     * Method updates registered observers on information of subject
     * @param location Location Information of subject
     * @param description Description of Subject
     * @param accomplices Accomplices of Subject
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);

}
