package observer;
import java.util.ArrayList;
/**
 * Cook class that implements the subject interface
 * @author Jackson Dawson
 */
public class Cook implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;

    /**
     * Cook constructor, sets name and declares observers array list
     * @param name pulls name from Driver class
     */
    public Cook(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * registerObserver method from interface, registers observers to subject cook
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * removeObserver method from interface, removes observers from subject cook
     */
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * notifyObservers method from interface, updates observers of cook class
     */
    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }   
    }
    
    /**
     * Method enters sighting and notifies observers
     * @param location contains location data from driver
     * @param description contais description data from driver
     * @param accomplices contains accomplice data from driver
     */
    public void enterSighting(String location, String description, String accomplices){
        ArrayList<String> arrListAccom = new ArrayList<String>();
        String[] arrOfAccomplices = accomplices.split(", ");
        for(String accom : arrOfAccomplices)
        {
            arrListAccom.add(accom);
        }
        notifyObservers(location, description, arrListAccom);
    }

    /**
     * Method returns name of cook
     * @return String of the name of the cook
     */
    public String getName(){
        return this.name;
    }
}
