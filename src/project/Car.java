package project;
import java.util.*;
final class Car  extends Vehicle{
    private String color;

    public Car(String color, int vID, String owner, String model, int year, ArrayList<Service> services) {
        super(vID, owner, model, year, services);
        this.color = color;
    }



    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
