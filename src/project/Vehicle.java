package project;
import java.util.*;
abstract class Vehicle {
    private int vID;
    private String owner;
    private String model;
    private int year;
    private ArrayList<Service>services;

   

    public Vehicle(int vID, String owner, String model, int year, ArrayList<Service> services) {
        this.vID = vID;
        this.owner = owner;
        this.model = model;
        this.year = year;
        this.services = services;
    }    

    public int getvID() {
        return vID;
    }

    public void setvID(int vID) {
        this.vID = vID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    
    
    
    public String Invoice(){
        double sum=0.0;
        for(Service s:services)
            sum+=s.getPrice();
        String x="";
        for(Service s:services)
            x+=s+"\t";
        return vID+"\t\t\t"+owner+"\t\t\t"+model+"\t\t\t"+year+"\t\t\t"+x+"\t\t\t"+sum;
    }

}
