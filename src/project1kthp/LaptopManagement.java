
package project1kthp;
import java.util.* ; 

public class LaptopManagement implements LaptopManager {
    private List<Laptop> ListLT = new ArrayList<>() ; 
   
    public LaptopManagement() {
        
    }

    public LaptopManagement(List<Laptop> ListLT) {
        this.ListLT = ListLT;
    }

    public List<Laptop> getListLT() {
        return ListLT;
    }

    public void setListLT(ArrayList<Laptop> ListLT) {
        this.ListLT = ListLT;
    }
    
    

    @Override
    public void update(int id) {
        Scanner sc = new Scanner (System.in) ;
        try {
            for (Laptop laptop : ListLT) {
                if ( laptop.getId() == id  ) {
                    System.out.print(" Update newID cho laptop co id la " +id +" : " );
                    int newID = Integer.parseInt(sc.nextLine()) ; laptop.setId(newID);
            }
        }            
        } catch (Exception e) {
            System.out.println(" Danh sach ko có Laptop nao co ID = " +id );
        }
        System.out.println("");
        
    }

    @Override
    public void add(Laptop l) {
        ListLT.add(l) ; 
    }

    @Override
    public void del(Laptop l) {
        try {
            for (Laptop laptop : ListLT) {
                if ( laptop == l ) {
                        ListLT.remove(l) ;
                        return ;
                }
            }
        } 
        catch (Exception e) {
            System.out.println(" Khong ton tai san pham " +l.getName());
        }

    }

    @Override
    public Laptop search(String name) {
        try {
            for (Laptop laptop : ListLT) {
                if( laptop.getName().contains(name) ) ;
                return laptop ;
            }
        } catch (Exception e) {
            System.out.println(" Khong ton tai san pham co ten " +name);
        }
        return null ;
    }

    @Override
    public double getTotal() {
        double Total = 0 ;
            for (Laptop laptop : ListLT) {
                Total += laptop.getAmount() ; 
            }
            return Total ;

    }

    @Override
    public List<Laptop> getList() {
        return ListLT ;
    }


    
}
