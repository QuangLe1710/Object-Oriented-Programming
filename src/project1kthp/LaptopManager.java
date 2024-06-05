
package project1kthp;

import java.util.List;


public interface LaptopManager {
    public abstract void update ( int id ) ;
    public abstract void add ( Laptop l ) ;
    public abstract void del ( Laptop l ) ; 
    public abstract Laptop search ( String name ) ;
    public abstract double getTotal() ; 
    public abstract List<Laptop> getList() ;
    
}
