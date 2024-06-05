
package project1kthp;
import java.util.* ;

public class Running {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        LaptopManagement LM = new LaptopManagement() ;
        Laptop lap01 = new Laptop("SamSung", "14", 1, "galaxyS3", 1, 1) ;
        LM.add(lap01);
        
        Laptop lap02 = new Laptop("Istore", "13", 2, "IpotPro", 2, 2) ;
        LM.add(lap02);
        
        Laptop lap03 = new Laptop("ASUS", "15", 3, "ASUSPro", 3, 3) ;
        LM.add(lap03);
     
//        List<Laptop> ListL = LM.getList() ;
        
        for (Laptop laptop : LM.getList()) {
            System.out.println(laptop);
        }
        System.out.println("");
        System.out.println("");
        
        
        LM.update(1);
        System.out.println(" Danh sach sau khi da thay doi ID : ");
        for (Laptop laptop : LM.getList()) {
            System.out.println(laptop);
        }
        System.out.println("");
        System.out.println("");
        
        
        System.out.println(" Danh sach truoc khi xoa ! ");
        for (Laptop laptop : LM.getList()) {
            System.out.println(laptop);
        }
        System.out.println("");
        System.out.println("");
        
        LM.del(lap03);
        System.out.println(" Danh sach sau khi xoa " +lap03.getName());
        for (Laptop laptop : LM.getList()) {
            System.out.println(laptop);
        }
        System.out.println("");
        System.out.println("");
        
        
        
        System.out.println(" Tim kiem laptop  " +lap02.getName());
        Laptop lapX = LM.search(lap02.getName()) ; 
        System.out.println(lapX );
        System.out.println("");
        System.out.println("");
        
        
        System.out.println(" Total : " +LM.getTotal() + "VND");
        
        
    }
}