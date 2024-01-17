package observer;
import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;

    public Cook(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }   
    }

    public void enterSighting(String location, String description, String accomplices){
        //Sighting sighting = new Sighting(location, accomplices, accomplices);
    }

    public String getName(){
        return this.name;
    }
}
