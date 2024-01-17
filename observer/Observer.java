package observer;
import java.util.ArrayList;
/**
 * Observer interface that is registered with the Subject Interface
 * @author Jackson Dawson
 */
public interface Observer {
    /**
     * update interface updates Observer with information regarding Subject
     * @param location Location of Subject
     * @param description Description of Subject
     * @param accomplices Accomplices of Subject
     */
    public void update(String location, String description, ArrayList<String> accomplices);
    /**
     * Method get's DEA or Cartel Logs
     * @return String of Cartel or DEA logs.
     */
    public String getLog();

    
}
