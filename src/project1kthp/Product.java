
package project1kthp;


public abstract class Product {
    private int id ; 
    private String name ; 
    private double price ; 
    private double quality ; 

    public Product() {
    }

    public Product(int id, String name, double price, double quality) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quality=" + quality + '}';
    }
    
    public abstract double getAmount() ; 
    
}
