package project;
import java.util.*;
public class Garage {
    private String name;
    private String owner;
    private ArrayList<Vehicle>vehicles;
    private String location;

    public Garage(String name, String owner, ArrayList<Vehicle> vehicles, String location) {
        this.name = name;
        this.owner = owner;
        this.vehicles = vehicles;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
