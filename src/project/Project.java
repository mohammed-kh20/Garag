package project;
import java.util.*;
public class Project {
   public static final String BLUE = "\u001B[34m";
   public static final String YELLOW = "\u001B[33m";
   public static final String RED = "\u001B[31m";
   public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        ArrayList<Vehicle>vehicles=new ArrayList<>();
        //////////////////////////////////////////////////////////////////////////
        ArrayList<Service>services1=new ArrayList<>();
        services1.add(new Service(300,"Frotglass"));
        services1.add(new Service(200,"wheels"));
        vehicles.add(new Car("Blue",456987412,"Yamen","Volvo",2024,services1));
        //////////////////////////////////////////////////////////////////////////
        ArrayList<Service>services2=new ArrayList<>();
        services2.add(new Service(3000,"katawt"));
        services2.add(new Service(200,"wheels"));
        vehicles.add(new Car("Red",446989412,"Khamaysa","BMW",2024,services2));
        //////////////////////////////////////////////////////////////////////////
        ArrayList<Service>services3=new ArrayList<>();
        services3.add(new Service(4000,"Engine"));
        services3.add(new Service(200,"wheels"));
        vehicles.add(new Bus("Green",466988452,"Khader","Marcvedice",2012,services3));
        //////////////////////////////////////////////////////////////////////////
        Garage g=new Garage("AnabtaGarage","MohammedKhader",vehicles,"Tulkarm-Anabta");
       
//        for(Vehicle v:g.getVehicles())
//         if(v instanceof Car)
//         for(Service s:v.getServices())
//         if(s.getDescription()=="wheels"&&((Car) v).getColor()=="Red")
//         System.out.println(YELLO+v.Invoice()+"\n");
    }
}