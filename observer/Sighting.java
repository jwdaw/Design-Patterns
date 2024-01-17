package observer;
import java.util.ArrayList;
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;
    
    public Sighting(String location, String details, ArrayList<String> accomplices){
        this.location = location;
        this.details = details;
        accomplices = new ArrayList<String>();
    }

    public String getLocation(){
        return this.location;
    }

    public String getDetails(){
        return this.details;
    }

    public String getAccomplices(){
        return accomplices.toString();
    }
}
