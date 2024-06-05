
package project1kthp;


public class Laptop extends Product {
    private String manufacturer ;
    private String screensize ; 

    public Laptop() {
        super() ;
    }

    public Laptop(String manufacturer, String screensize) {
        this.manufacturer = manufacturer;
        this.screensize = screensize;
    }

    public Laptop(String manufacturer, String screensize, int id, String name, double price, double quality) {
        super(id, name, price, quality);
        this.manufacturer = manufacturer;
        this.screensize = screensize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    @Override
    public String toString() {
        return "Laptop{" + "manufacturer=" + manufacturer + ", screensize=" + screensize + super.toString() + '}';
    }
    
    
    
    
    @Override
    public double getAmount() {
        return super.getPrice()*super.getQuality() ; 
    }
    
}
