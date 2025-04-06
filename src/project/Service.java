package project;
public class Service {
    private int sn=++c;
    private double price;
    static int c=0;
    private String description;

    public Service(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   @Override
   public String toString(){
       return "{"+sn+"    "+price+"    "+description+"}";
   }
    
}
